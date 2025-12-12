package service;

import java.util.ArrayList;
import models.Game;


public class GameService {
	//creazione arrayList
	ArrayList<Game> games = new ArrayList<Game>();
	
	//creazione metodo insertgame
	public void insertGame(String name, int realeseYear, int difficultLevel)
	{	
		Game game = new Game(name, realeseYear, difficultLevel);
		this.games.add(game);
		System.out.println("Gioco inserito con successo");
	}
	
	// creazione metodo pintgamelist 
	public void printGameList()
	{
		for (int i = 0; i < this.games.size(); i++) {
			System.out.println( (i+1) + "° " + this.games.get(i).toString());
		}
	}
	
	// cerca gioco
	public void searchGame(String search) 
	{
		  for(int i = 0; i < this.games.size(); i++) 
		  {
			  if(this.games.get(i).getName().contains(search))
			  {
				  System.out.println("Hai cercato il " + this.games.get(i).toString());
			  }
			  else 
			  {
				  System.out.println("Gioco non trovato");
			  }
		  }
	}
	// metodo filtra per difficoltà difficile
	public void printFromDifficulty() 
	{
		int cont = 1;
		for(int i = 0; i < this.games.size(); i++) 
		  {
			  if(this.games.get(i).getDifficultLevel() >= 4)
			  {
				  System.out.println((cont) + "° gioco difficile:\n" + this.games.get(i).toString());
				  cont++;
			  }
			  else 
			  {
				  System.out.println("Gioco non trovato");
			  }
		  }
	}
}