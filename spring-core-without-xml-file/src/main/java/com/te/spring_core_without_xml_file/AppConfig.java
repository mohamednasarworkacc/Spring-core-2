package com.te.spring_core_without_xml_file;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	@Bean
	public Bike getBike()
	{
		return new Bike();
	}
	@Bean
	public Car getCar()
	{
		Car c=new Car();
		c.setName("dammy car");
		return c;
	}
	@Bean
	public Tyre getTyre()
	{
		return new Tyre();
	}

}
