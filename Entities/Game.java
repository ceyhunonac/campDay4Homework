package Entities;

public class Game {
	
	private int gameId;
	private String gameName;
	private double price;
	private int esrbRate;
	
	public Game() {
		
	}
	
	
	public Game(int gameId, String gameName, double price, int esrbRate) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.price = price;
		this.esrbRate = esrbRate;
	}


	public int getGameId() {
		return gameId;
	}


	public void setGameId(int gameId) {
		this.gameId = gameId;
	}


	public String getGameName() {
		return gameName;
	}


	public void setGameName(String gameName) {
		this.gameName = gameName;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getEsrbRate() {
		return esrbRate;
	}


	public void setEsrbRate(int esrbRate) {
		this.esrbRate = esrbRate;
	}
	

}
