package com.game.domain;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class VideoGame {
	
	@OneToOne(cascade = CascadeType.ALL, optional = true)
	@JoinColumn(name = "game_id")
	private  Game game;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date releaseDate;
	
	private String typeConsole;
	
	public VideoGame() {}
	
	public VideoGame(Date releaseDate,String typeConsole) {
		super();
		this.releaseDate = releaseDate;
		this.typeConsole = typeConsole;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTypeConsole() {
		return typeConsole;
	}

	public void setTypeConsole(String typeConsole) {
		this.typeConsole = typeConsole;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}
	
}
