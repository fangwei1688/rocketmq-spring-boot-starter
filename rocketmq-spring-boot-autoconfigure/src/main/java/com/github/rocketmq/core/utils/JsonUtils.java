package com.github.rocketmq.core.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import java.util.Map;

/**
 * ClassName: JsonUtils <br/>
 * Description: <br/>
 * date: 2019/4/27 16:16<br/>
 *
 * @author ThierrySquirrel<br />
 * @since JDK 1.8
 */
public class JsonUtils {
	/**
	 * 得到Gson
	 *
	 * @return gson
	 */
	private static Gson getGson() {
		return new GsonBuilder()
				.setPrettyPrinting()
				.create();
	}

	/**
	 * 序列化为Json
	 *
	 * @param obj 对象
	 * @return json
	 */
	public static String toJson(Object obj) {
		return getGson().toJson(obj);
	}

	/**
	 * Json反序列化为对象
	 * @param json json
	 * @param classOfT 对象
	 * @param <T> 对象
	 * @return 对象
	 */
	public static  <T> T fromJson(String json, Class<T> classOfT){
		return getGson().fromJson(json,classOfT);
	}


}
