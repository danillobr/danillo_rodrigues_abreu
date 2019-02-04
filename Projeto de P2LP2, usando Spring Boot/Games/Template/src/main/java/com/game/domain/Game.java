package com.game.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String name;
	private String objectiveGame;
	
	public Game() {}

	public Game(String name, String objectiveGame) {
		super();
		this.name = name;
		this.objectiveGame = objectiveGame;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getObjectiveGame() {
		return objectiveGame;
	}

	public void setObjectiveGame(String objectiveGame) {
		this.objectiveGame = objectiveGame;
	}
	
}