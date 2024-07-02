package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestMapper extends BaseMapper<TestEntity> {
}
