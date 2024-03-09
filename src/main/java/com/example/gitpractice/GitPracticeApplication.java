package com.example.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

	public static void main(String[] args) {
		System.out.println("Gift from feature b");
		System.out.println("Message from feature b");
		System.out.println("Car from feature b");
		SpringApplication.run(GitPracticeApplication.class, args);
        System.out.println("Feature/A(C1,C2)");
	}

}
