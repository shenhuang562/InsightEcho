package com.example.InsightEcho;
import com.example.InsightEcho.entity.Message;
import com.example.InsightEcho.entity.TestEntity;
import com.example.InsightEcho.mapper.MessageMapper;
import com.example.InsightEcho.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
public class Test {
    @Autowired
    private MessageMapper messageMapper;

    @org.junit.jupiter.api.Test
    public void testInsertMessage() {
        Message message = new Message();
        message.setNickname("John Doe");
        message.setAvatar("avatar.jpg");
        message.setMessageContent("Hello, world!");
        message.setIpAddress("127.0.0.1");
        message.setIpSource("Localhost");
        message.setIsCheck(1); // Assuming it's checked
        message.setCreateTime(LocalDateTime.now());
        message.setUpdateTime(LocalDateTime.now());

        messageMapper.insert(message);
    }
}
