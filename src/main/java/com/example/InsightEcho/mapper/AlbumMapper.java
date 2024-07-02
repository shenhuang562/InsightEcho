package com.example.InsightEcho.mapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.InsightEcho.entity.Album;
import org.apache.ibatis.annotations.Mapper;

/**
 * 相册 Mapper
 *
 * @author ican
 */
@Mapper
public interface AlbumMapper extends BaseMapper<Album> {

    /**
     * 查询后台相册列表
     *
     * @param albumQuery 相册查询条件
     * @return 后台相册列表
     */
    //List<AlbumBackResp> selectBackAlbumList(@Param("param") AlbumQuery albumQuery);

    /**
     * 根据id查询相册信息
     *
     * @param albumId 相册id
     * @return 相册
     */
    //AlbumReq selectAlbumById(@Param("albumId") Integer albumId);

    /**
     * 根据id查询照片相册信息
     *
     * @param albumId 相册id
     * @return 照片相册信息
     */
    //AlbumBackResp selectAlbumInfoById(Integer albumId);

    /**
     * 查看相册列表
     *
     * @return 相册列表
     */
    //List<AlbumResp> selectAlbumVOList();
}