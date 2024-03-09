package com.example.gitpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitPracticeApplication {

	public static void main(String[] args) {
		System.out.println("Payment functionality 1");
		System.out.println("Book from feature b");
		System.out.println("Gift from feature a");
		System.out.println("Gift from feature b");
		System.out.println("Message from feature a");
		System.out.println("Message from feature b");
		System.out.println("Car from feature b");
		System.out.println("Power from feature b");
		System.out.println("Energy from feature b");
		SpringApplication.run(GitPracticeApplication.class, args);
        System.out.println("Feature/A(C1,C2)");
	}

}
