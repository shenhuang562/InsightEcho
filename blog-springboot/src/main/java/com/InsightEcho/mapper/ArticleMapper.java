package com.example.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.InsightEcho.entity.Article;
import com.example.InsightEcho.query.ArticleConditionQuery;
import com.example.InsightEcho.query.ArticleQuery;
import com.example.InsightEcho.query.PageQuery;
import com.example.InsightEcho.response.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;


@Mapper
public interface ArticleMapper extends BaseMapper<Article> {
    /**
     * 查询后台文章数量
     *
     * @param articleQuery 文章查询条件
     * @return 文章数量
     */
    Long selectBackArticleCount(@Param("param") ArticleQuery articleQuery);

    /**
     * 查询后台文章列表
     *
     * @param articleQuery 文章查询条件
     * @return 后台文章列表
     */
    List<ArticleBackResp> selectBackArticleList(@Param("param") ArticleQuery articleQuery);

    /**
     * 根据id查询文章信息
     *
     * @param articleId 文章id
     * @return 文章信息
     */
    ArticleInfoResp selectArticleInfoById(@Param("articleId") Integer articleId);

    /**
     * 文章搜索
     *
     * @param keyword 关键字
     * @return 文章列表
     */
    List<ArticleSearchResp> searchArticle(@Param("keyword") String keyword);

    /**
     * 查询首页文章
     *
     * @param pageQuery 分页条件
     * @return 首页文章
     */
    List<ArticleHomeResp> selectArticleHomeList(@Param("param") PageQuery pageQuery);

    /**
     * 根据id查询首页文章
     *
     * @param articleId 文章id
     * @return 首页文章
     */
    ArticleResp selectArticleHomeById(Integer articleId);

    /**
     * 查询上一篇文章
     *
     * @param articleId 文章id
     * @return 上一篇文章
     */
    ArticlePaginationResp selectLastArticle(Integer articleId);

    /**
     * 查询下一篇文章
     *
     * @param articleId 文章id
     * @return 下一篇文章
     */
    ArticlePaginationResp selectNextArticle(Integer articleId);

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
    List<ArticleRecommendResp> selectArticleRecommend();

    /**
     * 根据条件查询文章
     *
     * @param articleConditionQuery 查询条件
     * @return 文章列表
     */
    List<ArticleConditionResp> selectArticleListByCondition(@Param("param") ArticleConditionQuery articleConditionQuery);
}