package com.InsightEcho.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.InsightEcho.entity.BlogFile;
import com.InsightEcho.model.vo.query.FileQuery;
import com.InsightEcho.model.vo.response.FileResp;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * ClassName:BlogFileMapper
 * Package:com.InsightEcho.mapper
 * Description:文件Mapper
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午5:10
 * @Version:v1.0
 */
@Repository
public interface BlogFileMapper extends BaseMapper<BlogFile> {

    /**
     * 查询后台文件列表
     *
     * @param fileQuery 文件条件
     * @return 后台文件列表
     */
    List<FileResp> selectFileVOList(@Param("param") FileQuery fileQuery);
}
