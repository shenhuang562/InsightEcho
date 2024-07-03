package com.InsightEcho.mapper;

import com.InsightEcho.entity.Photo;
import com.InsightEcho.model.vo.query.PhotoQuery;
import com.InsightEcho.model.vo.response.PhotoBackResp;
import com.InsightEcho.model.vo.response.PhotoResp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
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
