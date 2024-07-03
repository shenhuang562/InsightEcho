package com.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
/**
 * ClassName:Album
 * Package:com.InsightEcho.entity
 * Description:相册
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:38
 * @Version:v1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Album {

    /**
     * 相册id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 相册名
     */
    private String albumName;

    /**
     * 相册封面
     */
    private String albumCover;

    /**
     * 相册描述
     */
    private String albumDesc;

    /**
     * 状态 (1公开 2私密)
     */
    private Integer status;

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
