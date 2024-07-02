package com.InsightEcho.model.vo.query;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ClassName:UserQuery
 * Package:com.InsightEcho.model.vo.query
 * Description:用户查询条件
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 上午9:44
 * @Version:v1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "用户查询条件")
public class UserQuery extends PageQuery {

    /**
     * 搜索内容
     */
    @ApiModelProperty(value = "搜索内容")
    private String keyword;

    /**
     * 登录方式 (1邮箱 2QQ  3Github)
     */
    @ApiModelProperty(value = "登录方式 (1邮箱 2QQ  3Github)")
    private Integer loginType;

}
