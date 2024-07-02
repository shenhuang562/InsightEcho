package com.example.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("t_visit_log")
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
