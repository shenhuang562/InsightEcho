package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * ClassName:FolderReq
 * Package:com.InsightEcho.model.vo.request
 * Description:目录Request
 *
 * @Author:mind-king
 * @Create:2024/7/1 - 下午5:02
 * @Version:v1.0
 */
@Data
@ApiModel(description = "目录Request")
public class FolderReq {
    /**
     * 文件路径
     */
    @NotBlank(message = "文件路径不能为空")
    @ApiModelProperty(value = "文件路径", required = true)
    private String filePath;

    /**
     * 文件名称
     */
    @NotBlank(message = "文件名称不能为空")
    @ApiModelProperty(value = "文件名称", required = true)
    private String fileName;
}
