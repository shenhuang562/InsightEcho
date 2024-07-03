package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.SiteConfig;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
/**
 * ClassName:SiteConfigMapper
 * Package:com.InsightEcho.mapper
 * Description:网站配置 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午9:22
 * @Version:v1.0
 */
@Mapper
public interface SiteConfigMapper extends BaseMapper<SiteConfig> {

}