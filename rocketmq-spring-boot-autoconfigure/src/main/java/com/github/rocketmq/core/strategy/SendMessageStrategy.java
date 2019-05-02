package com.github.rocketmq.core.strategy;

import com.aliyun.openservices.ons.api.Message;
import com.aliyun.openservices.ons.api.Producer;
import com.github.rocketmq.annotation.RockerMessage;
import com.github.rocketmq.core.producer.DefaultSendCallback;
import com.github.rocketmq.core.producer.MessageSendType;

/**
 * ClassName: SendMessageStrategy <br/>
 * Description: <br/>
 * date: 2019/4/29 23:37<br/>
 *
 * @author ThierrySquirrel<br />
 * @since JDK 1.8
 */
public class SendMessageStrategy {
	public static void send(RockerMessage rockerMessage, Producer producer, Message message){
		if(rockerMessage.messageSendType().equals(MessageSendType.SEND)){
			producer.send(message);
			return;
		}
		if(rockerMessage.messageSendType().equals(MessageSendType.SEND_ASYNC)){
			producer.sendAsync(message,new DefaultSendCallback());
			return;
		}
		if(rockerMessage.messageSendType().equals(MessageSendType.SEND_ONEWAY)){
			producer.sendOneway(message);
		}
	}
}
