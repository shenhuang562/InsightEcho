package com.example.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName("t_carousel")
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
