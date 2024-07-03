package com.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * ClassName:ArticleTag
 * Package:com.InsightEcho.entity
 * Description:文章标签
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:55
 * @Version:v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ArticleTag {

    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 文章id
     */
    private Integer articleId;

    /**
     * 标签id
     */
    private Integer tagId;

}
