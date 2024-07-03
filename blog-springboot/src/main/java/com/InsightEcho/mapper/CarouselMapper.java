package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Carousel;
import com.InsightEcho.model.vo.query.CarouselQuery;
import com.InsightEcho.model.vo.response.CarouselBackResp;
import com.InsightEcho.model.vo.response.CarouselResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:CarouselMapper
 * Package:com.InsightEcho.mapper
 * Description:轮播图Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午9:14
 * @Version:v1.0
 */
@Repository
public interface CarouselMapper extends BaseMapper<Carousel> {

    /**
     * 查询后台轮播图列表
     *
     * @param carouselQuery 轮播图查询条件
     * @return 后台轮播图列表
     */
    List<CarouselBackResp> selectBackCarouselList(@Param("param") CarouselQuery carouselQuery);

    /**
     * 查看轮播图列表
     *
     * @return 轮播图列表
     */
    List<CarouselResp> selectCarouselList();

}
