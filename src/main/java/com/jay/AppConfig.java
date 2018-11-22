package com.jay;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jay.entity.BaseballGame;
import com.jay.entity.Cubs;
import com.jay.entity.Game;
import com.jay.entity.RedSox;
import com.jay.entity.Team;

@Configuration
public class AppConfig {
	
	@Bean
	public Game game() {
		return new BaseballGame(redSox(), cubs());
	}
	
	@Bean
	public Team redSox() {
		return new RedSox();
	}
	
	@Bean
	public Team cubs() {
		return new Cubs();
	}

}
