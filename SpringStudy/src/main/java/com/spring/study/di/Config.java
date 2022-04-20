package com.spring.study.di;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Config {
	
	private AuthDao authDao;
	
	@Bean
	private AuthService authService() {
		return new AuthServiceImpl();
	}
}
