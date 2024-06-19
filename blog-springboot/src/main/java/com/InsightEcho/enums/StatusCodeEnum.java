package main.java.com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:StatusCodeEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:
 *
 * @Author:mind-king
 * @Create:2024/6/20 - 上午12:21
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum StatusCodeEnum {
    /*
    操作成功
     */
    SUCCESS(200, "操作成功"),

    /*
    参数错误
     */
    VALID_ERROR(400, "参数错误"),

    /*
    未登录
     */
    UNAUTHORIZED(402, "未登录"),

    /*
    系统异常
     */
    SYSTEM_ERROR(-1, "系统异常"),

    /*
    操作失败
     */
    FAIL(500, "操作失败");

    /*
    状态码
     */
    private final Integer code;

    /*
    返回信息
     */
    private final String msg;

}
