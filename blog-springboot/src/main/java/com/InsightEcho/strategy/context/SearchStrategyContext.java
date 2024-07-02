package com.InsightEcho.strategy.context;

import com.InsightEcho.model.vo.response.ArticleSearchResp;
import com.InsightEcho.strategy.SearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import static com.InsightEcho.enums.SearchModeEnum.getStrategy;
/**
 * ClassName:SearchStrategyContext
 * Package:com.InsightEcho.strategy.context
 * Description:搜索策略上下文
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午9:30
 * @Version:v1.0
 */
@Service
public class SearchStrategyContext {

    /**
     * 搜索模式
     */
    @Value("${search.mode}")
    private String searchMode;

    @Autowired
    private Map<String, SearchStrategy> searchStrategyMap;

    /**
     * 执行搜索策略
     *
     * @param keyword 关键字
     * @return {@link List <ArticleSearchVO>} 搜索文章
     */
    public List<ArticleSearchResp> executeSearchStrategy(String keyword) {
        return searchStrategyMap.get(getStrategy(searchMode)).searchArticle(keyword);
    }

}
