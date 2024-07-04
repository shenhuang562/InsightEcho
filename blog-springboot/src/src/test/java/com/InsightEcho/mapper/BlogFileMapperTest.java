package com.InsightEcho.mapper;

import com.InsightEcho.entity.BlogFile;
import com.InsightEcho.model.vo.query.FileQuery;
import com.InsightEcho.model.vo.response.FileResp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class BlogFileMapperTest {
    @Autowired
    private BlogFileMapper blogFileMapper;

    BlogFile blogFile = BlogFile.builder()
            .fileUrl("test")
            .fileName("test")
            .fileSize(1024)
            .extendName("jpg")
            .filePath("noTest")
            .isDir(1)
            .build();

    final FileQuery fileQuery = new FileQuery();

    @Test
    void selectFileVOList() {
        blogFileMapper.insert(blogFile);
        fileQuery.setFilePath("test");
        List<FileResp> list = blogFileMapper.selectFileVOList(fileQuery);
        System.out.println(list);
    }
}