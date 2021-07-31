package com.chunbin.jenkinstest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JenkinsTestApplication {


	public static void main(String[] args) {

		//启动容器
		ConfigurableApplicationContext ac  = SpringApplication.run(JenkinsTestApplication.class, args);
	}
}
