package main.java.com.InsightEcho.exception;

import lombok.Getter;

import static main.java.com.InsightEcho.enums.StatusCodeEnum.FAIL;

/**
 * ClassName:ServiceException
 * Package:main.java.com.InsightEcho.exception
 * Description:
 *
 * @Author:mind-king
 * @Create:2024/6/20 - 上午12:32
 * @Version:v1.0
 */
@Getter
public class ServiceException extends RuntimeException {
    /*
    返回失败状态码
     */
    private final Integer code = FAIL.getCode();

    /*
    返回信息
     */
    private final String message;

    public ServiceException(String message) {
        this.message = message;
    }

}
