package com.InsightEcho.model.vo.response;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
/**
 * ClassName:MessageResp
 * Package:com.InsightEcho.model.vo.response
 * Description:留言Response
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:09
 * @Version:v1.0
 */
@Data
@ApiModel(description = "留言Response")
public class MessageResp {

    /**
     * 留言id
     */
    @ApiModelProperty(value = "留言id")
    private Integer id;

    /**
     * 昵称
     */
    @ApiModelProperty(value = "昵称")
    private String nickname;

    /**
     * 头像
     */
    @ApiModelProperty(value = "头像")
    private String avatar;

    /**
     * 留言内容
     */
    @ApiModelProperty(value = "留言内容")
    private String messageContent;
}
