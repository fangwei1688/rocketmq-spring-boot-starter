package com.github.rocketmq.core.consumer;

import com.github.rocketmq.core.factory.execution.MethodFactoryExecution;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: AbstractRocketListener <br/>
 * Description: <br/>
 * date: 2019/4/27 17:07<br/>
 *
 * @author ThierrySquirrel<br />
 * @since JDK 1.8
 */
@Data
@Slf4j
public abstract class AbstractRocketListener {
	private MethodFactoryExecution methodFactoryExecution;

	public AbstractRocketListener(MethodFactoryExecution methodFactoryExecution) {
		this.methodFactoryExecution = methodFactoryExecution;
	}

	public void printErrorLog() {
		log.error("消费者代理失败！bean:{},method:{}",
				methodFactoryExecution.getBean(),
				methodFactoryExecution.getMethod());
	}


}
