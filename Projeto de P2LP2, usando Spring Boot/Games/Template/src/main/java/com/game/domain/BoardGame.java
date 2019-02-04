package com.game.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class BoardGame {
	
	@OneToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "game_id")
	private  Game game;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int numberParts;
	
	private String rules;
	
	public BoardGame() {}
	
	public BoardGame(int numberParts, String rules) {
		super();
		this.numberParts = numberParts;
		this.rules = rules;
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

	public int getNumberParts() {
		return numberParts;
	}

	public void setNumberParts(int numberParts) {
		this.numberParts = numberParts;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}
	
}