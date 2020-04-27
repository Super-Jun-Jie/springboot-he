package com.springboot.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import java.util.concurrent.TimeUnit;

@SpringBootTest
class RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Test
	public void testStringRedisTemplate() {
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		/**
		 * key
		 * value
		 * timeout 设置销毁时常
		 * unit 时间单位
		 */
		ops.set("a","test",5, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
		System.out.println((int)((Math.random()*9+1)*1000)+"");
	}

}
