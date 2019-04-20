package com.ark.arkbackenddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ArkBackendDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArkBackendDemoApplication.class, args);
		System.out.println("welocme to AOP");
	}

}
