package main.java.com.InsightEcho.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * ClassName:ChatTypeEnum
 * Package:main.java.com.InsightEcho.enums
 * Description:聊天状态枚举
 *
 * @Author:mind-king
 * @Create:2024/6/21 - 上午9:57
 * @Version:v1.0
 */
@Getter
@AllArgsConstructor
public enum ChatTypeEnum {
    /*
    在线人数
     */
    ONLINE_COUNT(1, "在线人数"),

    /*
    历史记录
     */
    HISTORY_RECORD(2, "历史记录"),

    /*
    发送消息
     */
    SEND_MESSAGE(3, "发送消息"),

    /*
    撤回消息
     */
    RECALL_MESSAGE(4, "撤回消息"),

    /*
    心跳消息
     */
    HEART_BEAT(5, "心跳消息");

    /*
    类型
     */
    private final Integer type;

    /*
    描述
     */
    private final String description;

    /*
     * 根据类型获取枚举
     * @param type 类型
     * @return 枚举
     */
    public static ChatTypeEnum getChatType(Integer type) {
        for (ChatTypeEnum chatType : values()) {
            if (chatType.getType().equals(type)) {
                return chatType;
            }
        }
        return null;
    }

}
