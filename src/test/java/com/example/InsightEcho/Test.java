package com.example.InsightEcho;
import com.example.InsightEcho.entity.TestEntity;
import com.example.InsightEcho.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class Test {
    @Autowired
    private TestMapper testMapper;

    @org.junit.jupiter.api.Test
    public void testFindUserById() {
        TestEntity testEntity = new TestEntity();
        testEntity.setValue("hello");

        testMapper.insert(testEntity);
    }
}
