package com.itkr.fakeinsta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;


@SpringBootApplication
public class FakeInstagramApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(FakeInstagramApplication.class, args);
	}

}
