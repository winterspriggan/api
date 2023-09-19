package com.group.libraryapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //annotation java spring boot 설정을 자동으로 해주는 역할 스프링 부트에선 스프링에서 해야되는 노가다를 다해줌
public class LibraryAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryAppApplication.class, args);
	}

}
