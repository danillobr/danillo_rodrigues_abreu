package com.game.resources;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.game.domain.CardGame;
import com.game.repository.CardGameRepository;

@RestController
public class CardGameResource {

	@Autowired
	private CardGameRepository repository;
	
	@GetMapping("/cardGame")
	public List<CardGame> getAllCardGame() {
		List <CardGame> cardGame = repository.findAll();
		return cardGame;
	}
	
	@PostMapping("/cardGame")
	public ResponseEntity<?>saveCardGame(@RequestBody CardGame cardGame) {
		CardGame savedCardGame = repository.save(cardGame);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedCardGame.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedCardGame.getGame().getName() + " - " + savedCardGame.getId());
	}
	
	@PutMapping("/cardGame/{id}")   
	public ResponseEntity<?> updateCardGame(@RequestBody CardGame cardGame, @PathVariable int id){
		Optional<CardGame> cardGameFound = repository.findById(id);
		
		if(!cardGameFound.isPresent())
			return ResponseEntity.notFound().build();
		
		cardGame.setId(id);
		repository.save(cardGame);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/cardGame/{id}")
	public void deleteCardGame(@PathVariable int id) {
		Optional<CardGame> cardGameFound = repository.findById(id);
		
		if(cardGameFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
	
}