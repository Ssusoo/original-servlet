package me.ssu.originalservlet.config;

import me.ssu.originalservlet.spring.SpringController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
	@Bean
	public SpringController springController() {
		return new SpringController();
	}
}
