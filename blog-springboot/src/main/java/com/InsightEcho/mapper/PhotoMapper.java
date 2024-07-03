package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.Photo;
import com.InsightEcho.model.vo.query.PhotoQuery;
import com.InsightEcho.model.vo.response.PhotoBackResp;
import com.InsightEcho.model.vo.response.PhotoResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
/**
 * ClassName:PhotoMapper.xml
 * Package:com.InsightEcho.mapper
 * Description:照片 Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/3 - 上午9:40
 * @Version:v1.0
 */
@Repository
public interface PhotoMapper extends BaseMapper<Photo> {

    /**
     * 查询后台照片列表
     *
     * @param photoQuery 照片查询条件
     * @return 后台照片列表
     */
    List<PhotoBackResp> selectBackPhotoList(@Param("param") PhotoQuery photoQuery);

    /**
     * 查询照片列表
     *
     * @param albumId 相册id
     * @return 后台照片列表
     */
    List<PhotoResp> selectPhotoVOList(@Param("albumId") Integer albumId);
}