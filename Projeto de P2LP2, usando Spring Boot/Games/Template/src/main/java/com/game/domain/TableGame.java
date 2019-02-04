package com.game.domain;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TableGame {
	
	@OneToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "game_id")
	private  Game game;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String numberPlayers;
	
	private String rules;
	
	public TableGame() {}
	
	public TableGame(String numberPlayers, String rules) {
		super();
		this.numberPlayers = numberPlayers;
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

	public String getNumberPlayers() {
		return numberPlayers;
	}

	public void setNumberPlayers(String numberPlayers) {
		this.numberPlayers = numberPlayers;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

}
