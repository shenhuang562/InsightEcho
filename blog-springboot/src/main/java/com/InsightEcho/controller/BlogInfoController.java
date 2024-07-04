package com.InsightEcho.controller;

import com.InsightEcho.annotation.VisitLogger;
import com.InsightEcho.model.vo.response.BlogBackInfoResp;
import com.InsightEcho.model.vo.response.BlogInfoResp;
import com.InsightEcho.model.vo.Result;
import com.InsightEcho.service.BlogInfoService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * ClassName:BlogInfoController
 * Package:com.InsightEcho.controller
 * Description:博客控制器
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:04
 * @Version:v1.0
 */
@Api(tags = "博客模块")
@RestController
public class BlogInfoController {

    @Autowired
    private BlogInfoService blogInfoService;

    /**
     * 上传访客信息
     *
     * @return {@link Result<>}
     */
    @ApiOperation(value = "上传访客信息")
    @PostMapping("/report")
    public Result<?> report() {
        blogInfoService.report();
        return Result.success();
    }

    /**
     * 查看博客信息
     *
     * @return {@link Result< BlogInfoResp >} 博客信息
     */
    @ApiOperation(value = "查看博客信息")
    @GetMapping("/")
    public Result<BlogInfoResp> getBlogInfo() {
        return Result.success(blogInfoService.getBlogInfo());
    }

    /**
     * 查看后台信息
     *
     * @return {@link Result< BlogBackInfoResp >} 后台信息
     */
    @ApiOperation(value = "查看后台信息")
    @GetMapping("/admin")
    public Result<BlogBackInfoResp> getBlogBackInfo() {
        return Result.success(blogInfoService.getBlogBackInfo());
    }

}
