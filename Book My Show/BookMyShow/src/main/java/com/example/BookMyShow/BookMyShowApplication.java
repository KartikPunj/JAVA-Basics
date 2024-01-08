package com.example.BookMyShow;

import com.example.BookMyShow.DTO.BookMovieRequestDto;
import com.example.BookMyShow.DTO.SignupRequestDTO;
import com.example.BookMyShow.DTO.SignupResponseDTO;
import com.example.BookMyShow.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class BookMyShowApplication implements CommandLineRunner {
	@Autowired
	private UserController userController;


	public static void main(String[] args)  {
		SpringApplication.run(BookMyShowApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		SignupRequestDTO signupRequestDTO = new SignupRequestDTO();
		signupRequestDTO.setEmailId("kartikpunj15@gmail.com");
		signupRequestDTO.setPassword("Hello");
		SignupResponseDTO signupResponseDTO = userController.singnUp(signupRequestDTO);

	}
}
