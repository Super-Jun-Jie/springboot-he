package com.springboot.redis;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

@SpringBootTest
class RedisApplicationTests {

	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Test
	public void testStringRedisTemplate() {
		ValueOperations<String, String> ops = stringRedisTemplate.opsForValue();
		ops.set("a","1");
	}

}
