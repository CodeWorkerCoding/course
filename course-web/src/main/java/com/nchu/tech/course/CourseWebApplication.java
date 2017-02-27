package com.nchu.tech.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:dubbo/dubbo.xml"})
public class CourseWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CourseWebApplication.class, args);
	}
}
