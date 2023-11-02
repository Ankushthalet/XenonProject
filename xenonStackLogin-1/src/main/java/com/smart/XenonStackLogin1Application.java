package com.smart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class XenonStackLogin1Application {
	
	@Autowired
	private BCryptPasswordEncoder bryBCryptPasswordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(XenonStackLogin1Application.class, args);
	}

}



