package com.jay;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jay.entity.Game;
import com.jay.entity.Team;

public class RunDemoWithSpring {
	public static void main(String[] args) {
		//ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game = context.getBean("game", Game.class);
		//System.out.println(game.playGame());
		
		Team cubs = context.getBean("cubs", Team.class);
		Team royals = context.getBean("royals", Team.class);
		Team redSox = context.getBean("redSox", Team.class);
		
		game.setAwayTeam(redSox);
		game.setHomeTeam(royals);
		System.out.println(game.playGame());
		
		game.setAwayTeam(cubs);
		game.setHomeTeam(redSox);
		System.out.println(game.playGame());
		
		System.out.println(context.getBeanDefinitionCount()+" Beans found");
		
		for(String bean : context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
		context.close();
	}

}
