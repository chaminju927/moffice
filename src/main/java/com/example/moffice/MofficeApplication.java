package com.example.moffice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@SpringBootApplication
@RestController
public class MofficeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MofficeApplication.class, args);
		System.out.println("서버 시작");
	}

}
