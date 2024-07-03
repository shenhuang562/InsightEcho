package com.InsightEcho.service;

import cn.hutool.extra.servlet.ServletUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.InsightEcho.constant.CommonConstant;
import com.InsightEcho.entity.Message;
import com.InsightEcho.entity.SiteConfig;
import com.InsightEcho.mapper.MessageMapper;
import com.InsightEcho.model.vo.PageResult;
import com.InsightEcho.model.vo.query.MessageQuery;
import com.InsightEcho.model.vo.request.CheckReq;
import com.InsightEcho.model.vo.request.MessageReq;
import com.InsightEcho.model.vo.response.MessageBackResp;
import com.InsightEcho.model.vo.response.MessageResp;
import com.InsightEcho.utils.BeanCopyUtils;
import com.InsightEcho.utils.HTMLUtils;
import com.InsightEcho.utils.IpUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
/**
 * ClassName:MessageService
 * Package:com.InsightEcho.service
 * Description:留言业务接口实现类
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:27
 * @Version:v1.0
 */
@Service
public class MessageService extends ServiceImpl<MessageMapper, Message> {

    @Autowired
    private MessageMapper messageMapper;

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private SiteConfigService siteConfigService;

    public List<MessageResp> listMessageVO() {
        // 查询留言列表
        return messageMapper.selectMessageVOList();
    }

    public PageResult<MessageBackResp> listMessageBackVO(MessageQuery messageQuery) {
        // 查询留言数量
        Long count = messageMapper.selectCount(new LambdaQueryWrapper<Message>()
                .like(StringUtils.hasText(messageQuery.getKeyword()), Message::getNickname, messageQuery.getKeyword())
                .eq(Objects.nonNull(messageQuery.getIsCheck()), Message::getIsCheck, messageQuery.getIsCheck()));
        if (count == 0) {
            return new PageResult<>();
        }
        // 查询后台友链列表
        List<MessageBackResp> messageBackRespList = messageMapper.selectBackMessageList(messageQuery);
        return new PageResult<>(messageBackRespList, count);
    }

    public void addMessage(MessageReq message) {
        SiteConfig siteConfig = siteConfigService.getSiteConfig();
        Integer messageCheck = siteConfig.getMessageCheck();
        String ipAddress = ServletUtil.getClientIP(request);
        String ipSource = IpUtils.getIpSource(ipAddress);
        Message newMessage = BeanCopyUtils.copyBean(message, Message.class);
        newMessage.setMessageContent(HTMLUtils.filter(message.getMessageContent()));
        newMessage.setIpAddress(ipAddress);
        newMessage.setIsCheck(messageCheck.equals(CommonConstant.FALSE) ? CommonConstant.TRUE : CommonConstant.FALSE);
        newMessage.setIpSource(ipSource);
        messageMapper.insert(newMessage);
    }

    public void updateMessageCheck(CheckReq check) {
        // 修改留言审核状态
        List<Message> messageList = check.getIdList()
                .stream()
                .map(id -> Message.builder()
                        .id(id)
                        .isCheck(check.getIsCheck())
                        .build())
                .collect(Collectors.toList());
        this.updateBatchById(messageList);
    }
}