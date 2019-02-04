package com.game.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class MemoryGame {
	
	@OneToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "game_id")
	private  Game game;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int numberPairs;
	
	private String resolutionTime;

	public MemoryGame() {}
	
	public MemoryGame(int numberPairs, String resolutionTime) {
		super();
		this.numberPairs = numberPairs;
		this.resolutionTime = resolutionTime;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getNumberPairs() {
		return numberPairs;
	}

	public void setNumberPairs(int numberPairs) {
		this.numberPairs = numberPairs;
	}

	public String getResolutionTime() {
		return resolutionTime;
	}

	public void setResolutionTime(String resolutionTime) {
		this.resolutionTime = resolutionTime;
	}
	
}
