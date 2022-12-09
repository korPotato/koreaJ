package com.starter.myweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyhomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyhomeApplication.class, args);
		System.out.println("웹 실행 완료");
	}

}
