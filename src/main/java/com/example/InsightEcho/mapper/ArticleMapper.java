package com.example.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.InsightEcho.entity.Article;
import com.example.InsightEcho.query.ArticleConditionQuery;
import com.example.InsightEcho.query.ArticleQuery;
import com.example.InsightEcho.query.PageQuery;
import com.example.InsightEcho.response.ArchiveResp;
import com.example.InsightEcho.response.ArticleStatisticsResp;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    /**
     * 查询符合条件的后台文章数量
     *
     * @param articleQuery 文章查询条件
     * @return 文章数量
     */
    Long selectBackArticleCount(@Param("param") ArticleQuery articleQuery);

    /**
     * 查询符合条件的后台文章列表
     *
     * @param articleQuery 文章查询条件
     * @return 后台文章列表
     */
    List<Article> selectBackArticleList(@Param("param") ArticleQuery articleQuery);

    /**
     * 根据id查询文章信息
     *
     * @param articleId 文章id
     * @return 文章信息
     */
    Article selectArticleInfoById(@Param("articleId") Integer articleId);
    /**
     * 文章搜索
     *
     * @param keyword 关键字
     * @return 文章列表
     */
    List<Article> searchArticle(@Param("keyword") String keyword);

    /**
     * 查询对应页文章
     *
     * @param pageQuery 分页条件
     * @return 对应页文章
     */
    List<Article> selectArticleHomeList(@Param("param") PageQuery pageQuery);

    /**
     * 根据id查询首页文章
     *
     * @param articleId 文章id
     * @return 首页文章
     */
    Article selectArticleHomeById(Integer articleId);

    /**
     * 查询上一篇文章
     *
     * @param articleId 文章id
     * @return 上一篇文章
     */
    Article selectLastArticle(Integer articleId);

    /**
     * 查询下一篇文章
     *
     * @param articleId 文章id
     * @return 下一篇文章
     */
    Article selectNextArticle(Integer articleId);

    /**
     * 查询文章归档
     *
     * @param pageQuery 分页
     * @return 文章归档
     */
    List<ArchiveResp> selectArchiveList(@Param("param") PageQuery pageQuery);

    /**
     * 查询文章统计
     *
     * @return 文章统计
     */
    List<ArticleStatisticsResp> selectArticleStatistics();

    /**
     * 查询推荐文章
     *
     * @return 推荐文章
     */
    List<Article> selectArticleRecommend();

    /**
     * 根据条件查询文章
     *
     * @param articleConditionQuery 查询条件
     * @return 文章列表
     */
    List<Article> selectArticleListByCondition(@Param("param") ArticleConditionQuery articleConditionQuery);
}
