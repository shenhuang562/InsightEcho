package com.InsightEcho.model.vo.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;
/**
 * ClassName:CheckReq
 * Package:com.InsightEcho.model.vo.request
 * Description:审核Request
 *
 * @Author:mind-king
 * @Create:2024/7/2 - 下午10:58
 * @Version:v1.0
 */
@Data
@ApiModel(description = "审核Request")
public class CheckReq {

    /**
     * id集合
     */
    @NotEmpty(message = "id不能为空")
    @ApiModelProperty(value = "id集合", required = true)
    private List<Integer> idList;

    /**
     * 是否通过 (0否 1是)
     */
    @NotNull(message = "状态值不能为空")
    @ApiModelProperty(value = "是否通过 (0否 1是)", required = true)
    private Integer isCheck;
}
