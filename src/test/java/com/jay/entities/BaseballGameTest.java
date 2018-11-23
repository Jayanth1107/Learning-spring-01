package com.jay.entities;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.jay.AppConfig;
import com.jay.entity.Game;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=AppConfig.class)
public class BaseballGameTest {
	
	@Autowired
	private Game game;
	
	@Autowired
	private ApplicationContext ctx;
	
	/*@Before
	public void setUp() {
		//ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		game = ctx.getBean("game", Game.class);
	}*/
	
	@Test
	public void testPlayGame() throws Exception {
		String home = game.getHomeTeam().getName();
		String away = game.getAwayTeam().getName();
		
		String result = game.playGame();
		
		assertTrue(result.contains(home) || result.contains(away));
	}
	

}
