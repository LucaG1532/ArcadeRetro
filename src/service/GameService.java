package service;

import java.util.ArrayList;
import models.Game;


public class GameService {
	ArrayList<Game> games = new ArrayList<Game>();
	
	public void insertGame(String name, int realeseYear, int difficultLevel)
	{	
		Game game = new Game(name, realeseYear, difficultLevel);
		this.games.add(game);
	}
}
