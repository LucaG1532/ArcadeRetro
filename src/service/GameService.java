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
	
	public void printGameList() {
		for (int i = 0; i < this.games.size(); i++) {
			System.out.println( (i+1) + "° " + this.games.get(i).toString());
		}
	}
	
	public void searchGame(String search) 
	{
		  for(int i = 0; i < this.games.size(); i++) 
		  {
			  if(this.games.get(i).getName().equals(search))
			  {
				  System.out.println("Hai cercato il " + this.games.get(i).toString());
			  }
			  else 
			  {
				  System.out.println("Contatto non trovato");
			  }
		  }
	}
}
