package com.example.app.SpringBootRestH2Client;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

// Вхідна точка в програму.
// @SpringBootApplication позначає головний клас програми.
// @SpringBootApplication інкапсулює анотації @Configuration,
// @EnableAutoConfiguration, @ComponentScan з їхніми атрибутами
// за замовчуванням.
// https://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/SpringBootApplication.html
@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(RestDemoApplication.class, args);

		new SpringApplicationBuilder(RestDemoApplication.class)
				.bannerMode(Banner.Mode.OFF) // <- запуск без Spring банеру
				.run(args);

		System.out.println("App running ...");
	}
}
