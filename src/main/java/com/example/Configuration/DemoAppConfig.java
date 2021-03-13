package com.example.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.Impl.DemoAppImpl;





@Configuration
@ComponentScan(basePackages = "com.example.Impl")
public class DemoAppConfig {
	
	@Bean
	public DemoAppImpl demoAppImpl()
	{
		return new DemoAppImpl();
	}
	
	

	}
	
	
	
	

