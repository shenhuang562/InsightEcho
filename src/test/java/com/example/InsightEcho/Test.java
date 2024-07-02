package com.example.InsightEcho;
import com.example.InsightEcho.entity.Article;
import com.example.InsightEcho.entity.Message;
import com.example.InsightEcho.entity.TestEntity;
import com.example.InsightEcho.mapper.ArticleMapper;
import com.example.InsightEcho.mapper.MessageMapper;
import com.example.InsightEcho.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class Test {
    @Autowired
    private ArticleMapper articleMapper;

    @org.junit.jupiter.api.Test
    public void testInsertMessage() {
        Article article = new Article();
        article.setUserId(1);
        article.setCategoryId(1);
        article.setArticleCover("hello");
        article.setArticleTitle("test");
        article.setArticleDesc("hi");
        article.setArticleContent("hello,world");
        articleMapper.insert(article);
    }
}
