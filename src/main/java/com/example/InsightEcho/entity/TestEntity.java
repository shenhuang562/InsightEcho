package com.example.InsightEcho.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class TestEntity {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String value;
}
