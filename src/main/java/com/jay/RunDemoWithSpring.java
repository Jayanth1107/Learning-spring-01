package com.jay;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jay.entity.Game;

public class RunDemoWithSpring {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Game game = context.getBean("game", Game.class);
		System.out.println(game.playGame());
		
		System.out.println(context.getBeanDefinitionCount()+" Beans found");
		
		for(String bean : context.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
	}

}
