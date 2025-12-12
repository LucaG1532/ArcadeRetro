package models;

public class Game {

	private String name;
	private int releaseYear; 
	private int difficultLevel;
	
	public Game(String name, int releaseYear, int difficultLevel) {
		this.name = name;
		this.releaseYear = releaseYear;
		this.difficultLevel = difficultLevel;
	}

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
	
	
}
