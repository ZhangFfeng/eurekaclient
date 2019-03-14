package com.gaeainfo.eurekaclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class EurekaclientApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientApplication.class, args);
	}
	@Value("${server.port}")
	String port;
	@RequestMapping("/")
	public String home(){
		return "hello worrld from port"+ port;
	}
	@RequestMapping("/1")
	public String home1(){
		return "hello worrld from port1"+ port;
	}
	@RequestMapping("/2")
	public String home2(){
		return "hello worrld from port2"+ port;
	}
}
