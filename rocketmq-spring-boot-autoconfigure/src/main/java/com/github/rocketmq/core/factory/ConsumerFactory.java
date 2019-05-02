package com.github.rocketmq.core.factory;

import com.aliyun.openservices.ons.api.Consumer;
import com.aliyun.openservices.ons.api.ONSFactory;
import com.aliyun.openservices.ons.api.order.OrderConsumer;

import java.util.Properties;


/**
 * ClassName: ConsumerFactory <br/>
 * Description: <br/>
 * date: 2019/4/27 15:55<br/>
 *
 * @author ThierrySquirrel<br />
 * @since JDK 1.8
 */
public class ConsumerFactory {

	public static Consumer createConsumer(Properties properties) {
		return ONSFactory.createConsumer(properties);
	}

	public static OrderConsumer createOrderConsumer(Properties properties) {
		return ONSFactory.createOrderedConsumer(properties);
	}
}
