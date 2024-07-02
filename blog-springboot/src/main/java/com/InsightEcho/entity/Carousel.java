package com.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
/**
 * ClassName:Carousel
 * Package:com.InsightEcho.entity
 * Description:轮播图
 *
 * @Author:mind-king
 * @Create:2024/6/30 - 下午11:30
 * @Version:v1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carousel {
    /**
     * 轮播图id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 轮播图地址
     */
    private String imgUrl;

    /**
     * 是否显示 (0否 1是)
     */
    private Integer status;

    /**
     * 备注
     */
    private String remark;

    /**
     * 创建时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @TableField(fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
}
