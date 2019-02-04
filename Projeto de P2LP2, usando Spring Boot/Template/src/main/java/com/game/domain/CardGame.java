package com.game.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CardGame {
	
	@OneToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "game_id")
	private  Game game;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int numberCards;
	
	private String typeCardGame;
	
	private String rules;

	public CardGame() {}

	public CardGame(int numberCards, String typeCardGame, String rules) {
		super();
		this.numberCards = numberCards;
		this.typeCardGame = typeCardGame;
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

	public int getNumberCards() {
		return numberCards;
	}

	public void setNumberCards(int numberCards) {
		this.numberCards = numberCards;
	}

	public String getTypeCardGame() {
		return typeCardGame;
	}

	public void setTypeCardGame(String typeCardGame) {
		this.typeCardGame = typeCardGame;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}
	
}
