package com.InsightEcho.strategy;

import com.InsightEcho.model.vo.response.ArticleSearchResp;

import java.util.List;
/**
 * ClassName:SearchStrategy
 * Package:com.InsightEcho.strategy
 * Description:文章搜索策略
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:31
 * @Version:v1.0
 */
public interface SearchStrategy {

    /**
     * 搜索文章
     *
     * @param keyword 关键字
     * @return {@link List< ArticleSearchResp >} 文章列表
     */
    List<ArticleSearchResp> searchArticle(String keyword);
}
