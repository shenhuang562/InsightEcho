package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * ClassName:FileResp
 * Package:com.InsightEcho.model.vo.response
 * Description: 文件后台Response
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午5:04
 * @Version:v1.0
 */
@Data
@ApiModel(description = "文件后台Response")
public class FileResp {
    /**
     * 文件id
     */
    @ApiModelProperty(value = "文件id")
    private Integer id;

    /**
     * 文件url
     */
    @ApiModelProperty(value = "文件url")
    private String fileUrl;

    /**
     * 文件名
     */
    @ApiModelProperty(value = "文件名")
    private String fileName;

    /**
     * 文件大小
     */
    @ApiModelProperty(value = "文件大小")
    private Integer fileSize;

    /**
     * 文件类型
     */
    @ApiModelProperty(value = "文件类型")
    private String extendName;

    /**
     * 文件路径
     */
    @ApiModelProperty(value = "文件路径")
    private String filePath;

    /**
     * 是否为目录 (0否 1是)
     */
    @ApiModelProperty(value = "是否为目录 (0否 1是)")
    private Integer isDir;

    /**
     * 创建时间
     */
    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;
}
