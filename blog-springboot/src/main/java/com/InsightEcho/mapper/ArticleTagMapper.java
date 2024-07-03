package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.ArticleTag;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:ArticleTagMapper
 * Package:com.InsightEcho.mapper
 * Description:文章标签 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:56
 * @Version:v1.0
 */
@Repository
public interface ArticleTagMapper extends BaseMapper<ArticleTag> {

    /**
     * 批量保存文章标签
     *
     * @param articleId 文章id
     * @param tagIdList 标签id列表
     */
    void saveBatchArticleTag(@Param("articleId") Integer articleId, List<Integer> tagIdList);
}
