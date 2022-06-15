package com.sixiemeGeste;

import com.sixiemeGeste.domain.model.User;
import com.sixiemeGeste.infrastructure.DAO.UserDAO;
import com.sixiemeGeste.infrastructure.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SixiemeGesteApplication {
	public static void main(String[] args) {
		SpringApplication.run(SixiemeGesteApplication.class, args);

	}
}
