package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Category;
import com.InsightEcho.model.vo.query.CategoryQuery;
import com.InsightEcho.model.vo.response.CategoryBackResp;
import com.InsightEcho.model.vo.response.CategoryResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:CategoryMapper
 * Package:com.InsightEcho.mapper
 * Description:分类 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:08
 * @Version:v1.0
 */
@Repository
public interface CategoryMapper extends BaseMapper<Category> {

    /**
     * 查询后台分类列表
     *
     * @param categoryQuery 分类查询条件
     * @return 后台分类列表
     */
    List<CategoryBackResp> selectBackCategoryList(@Param("param") CategoryQuery categoryQuery);

    /**
     * 查询分类列表
     *
     * @return 分类列表
     */
    List<CategoryResp> selectCategoryVO();
}
