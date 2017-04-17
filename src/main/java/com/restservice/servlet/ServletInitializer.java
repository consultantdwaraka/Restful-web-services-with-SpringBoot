package com.restservice.servlet;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.restservice.RestfulWebServicesWithSpringBootApplication;


/**
 * @author dwarakak
 * Servlet initializer.
 */
public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(RestfulWebServicesWithSpringBootApplication.class);
	}
}
