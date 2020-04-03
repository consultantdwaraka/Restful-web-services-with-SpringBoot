package com.example;

import static org.junit.Assert.assertTrue;

import com.restservice.RestfulWebServicesWithSpringBootApplication;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestfulWebServicesWithSpringBootApplication.class)
public class RestfulWebServicesWithSpringBootApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void testMe() {
		assertTrue(true);
	}
}
