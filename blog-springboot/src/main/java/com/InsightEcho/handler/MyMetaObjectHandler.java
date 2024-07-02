package com.InsightEcho.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;

import static com.InsightEcho.enums.ZoneEnum.SHANGHAI;
/**
 * ClassName:MyMetaObjectHandler
 * Package:com.InsightEcho.handler
 * Description:mybatis plus自动填充
 *
 * @Author:mind-king
 * @Create:2024/6/26 - 下午11:07
 * @Version:v1.0
 */
@Slf4j
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        if (metaObject != null) {
            this.strictInsertFill(metaObject, "createTime", LocalDateTime.class, LocalDateTime.now(ZoneId.of(SHANGHAI.getZone())));
        } else {
            log.warn("MetaObject is null in insertFill method.");
        }
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        if (metaObject != null) {
            this.strictUpdateFill(metaObject, "updateTime", LocalDateTime.class, LocalDateTime.now(ZoneId.of(SHANGHAI.getZone())));
        } else {
            log.warn("MetaObject is null in updateFill method.");
        }    }
}
