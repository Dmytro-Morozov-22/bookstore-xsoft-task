package com.morozov.projects.bookstore_xsoft_task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class, ManagementWebSecurityAutoConfiguration.class})
public class BookStoreXSoftTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreXSoftTaskApplication.class, args);
	}

}
