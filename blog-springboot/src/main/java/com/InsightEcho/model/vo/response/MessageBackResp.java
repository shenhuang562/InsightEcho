package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;
/**
 * ClassName:MessageBackResp
 * Package:com.InsightEcho.model.vo.response
 * Description:留言后台Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:08
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "留言后台Response")
public class MessageBackResp extends MessageResp {

    /**
     * 用户ip
     */
    @ApiModelProperty(value = "用户ip")
    private String ipAddress;

    /**
     * 用户地址
     */
    @ApiModelProperty(value = "用户地址")
    private String ipSource;

    /**
     * 是否通过 (0否 1是)
     */
    @ApiModelProperty(value = "是否通过 (0否 1是)")
    private Integer isCheck;

    /**
     * 留言时间
     */
    @ApiModelProperty(value = "留言时间")
    private LocalDateTime createTime;
}