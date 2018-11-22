package com.jay;

import com.jay.entity.BaseballGame;
import com.jay.entity.Cubs;
import com.jay.entity.Game;
import com.jay.entity.RedSox;
import com.jay.entity.Team;

public class RunDemoWithOutSpring {

	public static void main(String[] args) {
		Team redSox = new RedSox();
		Team cubs = new Cubs();
		Game game = new BaseballGame(redSox, cubs);
		
		//Team royals = new Royals();
		
		System.out.println(game.playGame());
	}

}
