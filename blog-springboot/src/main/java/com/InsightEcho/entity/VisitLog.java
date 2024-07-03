package com.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.time.LocalDateTime;
/**
 * ClassName:VisitLog
 * Package:com.InsightEcho.entity
 * Description:访问日志
 *
 * @Author:mind-king
 * @Create:2024/6/30 - 下午11:50
 * @Version:v1.0
 */
@Data
public class VisitLog {
    /**
     * id
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 访问页面
     */
    private String page;

    /**
     * 访问ip
     */
    private String ipAddress;

    /**
     * 访问地址
     */
    private String ipSource;

    /**
     * 操作系统
     */
    private String os;

    /**
     * 浏览器
     */
    private String browser;

    /**
     * 访问时间
     */
    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
}
