package main.java.com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:RoleEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:角色枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午10:34
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum RoleEnum {

    /**
     * 管理员
     */
    ADMIN("1", "admin"),
    /**
     * 用户
     */
    USER("2", "user"),
    /**
     * 测试账号
     */
    TEST("3", "test");

    /**
     * 角色id
     */
    private final String roleId;

    /**
     * 描述
     */
    private final String name;

}
