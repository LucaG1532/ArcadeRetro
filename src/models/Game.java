package models;

public class Game {
	// dichiarazioni variabili in modo privato
	private String name;
	private int releaseYear; 
	private int difficultLevel;
	
	//creazione del costruttore
	public Game(String name, int releaseYear, int difficultLevel) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.difficultLevel = difficultLevel;
	}
	//metodi getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getDifficultLevel() {
		return difficultLevel;
	}

	public void setDifficultLevel(int difficultLevel) {
		this.difficultLevel = difficultLevel;
	}
	
	// creazione metodo toStringh()
	@Override
	public String toString() {
		return "Gioco --> nome: " + name + ", anno pubblicazione: " + releaseYear + ", difficoltà gioco: " + difficultLevel;
	}
	
}
