package com.earthworm.rabbitmq.event;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @Author: yangh@i-earthworm.com
 * @Date: 2018/5/22 13:54
 * @version: v1.0.0
 * @Type:
 * @Desc: 消费者2
 */
@Component
public class MsgListenerImpl2 implements IMsgEventListener {
    // slf4j日志相关
    private Logger logger = LoggerFactory.getLogger(MsgListenerImpl2.class);

    @Override
    public boolean onEvent(MsgEventState msgEventState) {

        String messageStr = msgEventState.getMessageStr();
        if (msgEventState == null || messageStr == null) {
            logger.info("没有消息可被消费........");
            return false;
        }

        logger.info("MsgListenerImpl2中收到的 messageStr:{}", messageStr);
        logger.info("---------------------------------------------------------");

        return true;
    }
}
