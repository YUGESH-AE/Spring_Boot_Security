package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class SpringBootSecurityApiApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecurityApiApplication.class, args);
	}
// 	@Override
// 	public void addCorsMappings(CorsRegistry registry){
// 		registry.addMapping("/**").allowedMethods("GET","POST","PUT","DELETE");
// 	}

}
