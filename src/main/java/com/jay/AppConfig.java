package com.jay;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jay.entity.BaseballGame;
import com.jay.entity.Cubs;
import com.jay.entity.Game;
import com.jay.entity.RedSox;
import com.jay.entity.Team;

@Configuration
//@Import(InfrastructureConfig.class)
@ComponentScan(basePackages= "com.jay")
public class AppConfig {
	
	@Autowired
	public DataSource dataSource;
	
	@Autowired
	@Qualifier(value="redSox")
	public Team home;
	
	@Autowired
	@Qualifier(value="cubs")
	public Team away;
	
	@Bean
	//public Game game(DataSource dataSource) {
	public Game game() {
		//return new BaseballGame(redSox(), cubs());
		BaseballGame baseballGame = new BaseballGame(home, away);
		baseballGame.setDataSource(dataSource);
		return baseballGame;
	}
	
	/*@Bean
	public Team redSox() {
		return new RedSox();
	}
	
	@Bean
	public Team cubs() {
		return new Cubs();
	}*/

}
