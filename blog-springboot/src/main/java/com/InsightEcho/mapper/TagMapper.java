package com.InsightEcho.mapper;

import com.InsightEcho.entity.Tag;
import com.InsightEcho.model.vo.query.TagQuery;
import com.InsightEcho.model.vo.response.TagBackResp;
import com.InsightEcho.model.vo.response.TagOptionResp;
import com.InsightEcho.model.vo.response.TagResp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface TagMapper extends BaseMapper<Tag> {

    /**
     * 查询后台标签列表
     *
     * @param tagQuery 标签查询条件
     * @return 后台标签列表
     */
    List<TagBackResp> selectBackTagList(@Param("param") TagQuery tagQuery);

    /**
     * 批量保存新标签
     *
     * @param newTagList 新标签
     */
    void saveBatchTag(@Param("newTagList") List<Tag> newTagList);

    /**
     * 根据文章id查询文章标签名称
     *
     * @param articleId 文章id
     * @return 文章标签名称
     */
    List<String> selectTagNameByArticleId(@Param("articleId") Integer articleId);

    /**
     * 查询文章标签列表
     *
     * @return 文章标签列表
     */
    List<TagResp> selectTagVOList();

    /**
     * 查询标签列表
     *
     * @return 标签列表
     */
    List<TagOptionResp> selectTagOptionList();
}