package com.InsightEcho.controller;

import cn.dev33.satoken.annotation.SaCheckPermission;
import com.InsightEcho.annotation.AccessLimit;
import com.InsightEcho.annotation.OptLogger;
import com.InsightEcho.annotation.VisitLogger;
import com.InsightEcho.model.vo.PageResult;
import com.InsightEcho.model.vo.Result;
import com.InsightEcho.model.vo.query.MessageQuery;
import com.InsightEcho.model.vo.request.CheckReq;
import com.InsightEcho.model.vo.request.MessageReq;
import com.InsightEcho.model.vo.response.MessageBackResp;
import com.InsightEcho.model.vo.response.MessageResp;
import com.InsightEcho.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.InsightEcho.constant.OptTypeConstant.DELETE;
import static com.InsightEcho.constant.OptTypeConstant.UPDATE;
/**
 * ClassName:MessageController
 * Package:com.InsightEcho.controller
 * Description:留言控制器
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:24
 * @Version:v1.0
 */
@Api(tags = "留言模块")
@RestController
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * 查看留言列表
     *
     * @return {@link MessageResp} 留言列表
     */
    @VisitLogger(value = "留言")
    @ApiOperation(value = "查看留言列表")
    @GetMapping("/message/list")
    public Result<List<MessageResp>> listMessageVO() {
        return Result.success(messageService.listMessageVO());
    }

    /**
     * 查看后台留言列表
     *
     * @param messageQuery 留言查询条件
     * @return {@link Result< MessageBackResp >} 留言列表
     */
    @ApiOperation(value = "查看后台留言列表")
    @SaCheckPermission("news:message:list")
    @GetMapping("/admin/message/list")
    public Result<PageResult<MessageBackResp>> listMessageBackVO(MessageQuery messageQuery) {
        return Result.success(messageService.listMessageBackVO(messageQuery));
    }

    /**
     * 添加留言
     *
     * @param message 留言信息
     * @return {@link Result<>}
     */
    @AccessLimit(seconds = 60, maxCount = 3)
    @ApiOperation(value = "添加留言")
    @PostMapping("/message/add")
    public Result<?> addMessage(@Validated @RequestBody MessageReq message) {
        messageService.addMessage(message);
        return Result.success();
    }

    /**
     * 删除留言
     *
     * @param messageIdList 留言Id列表
     * @return {@link Result<>}
     */
    @OptLogger(value = DELETE)
    @ApiOperation(value = "删除留言")
    @SaCheckPermission("news:message:delete")
    @DeleteMapping("/admin/message/delete")
    public Result<?> deleteMessage(@RequestBody List<Integer> messageIdList) {
        messageService.removeByIds(messageIdList);
        return Result.success();
    }

    /**
     * 审核留言
     *
     * @param check 审核信息
     * @return {@link Result<>}
     */
    @OptLogger(value = UPDATE)
    @ApiOperation(value = "审核留言")
    @SaCheckPermission("news:message:pass")
    @PutMapping("/admin/message/pass")
    public Result<?> updateMessageCheck(@Validated @RequestBody CheckReq check) {
        messageService.updateMessageCheck(check);
        return Result.success();
    }

}
