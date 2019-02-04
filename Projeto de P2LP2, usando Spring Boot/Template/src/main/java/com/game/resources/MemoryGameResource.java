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

import com.game.domain.MemoryGame;
import com.game.repository.MemoryGameRepository;

@RestController
public class MemoryGameResource {

	@Autowired
	private MemoryGameRepository repository;
	
	@GetMapping("/memoryGame")
	public List<MemoryGame> getAllVideoMemoryGame() {
		List <MemoryGame> memoryGame = repository.findAll();
		return memoryGame;
	}
	
	@PostMapping("/memoryGame")
	public ResponseEntity<?>saveMemoryGame(@RequestBody MemoryGame memoryGame) {
		MemoryGame savedMemoryGame = repository.save(memoryGame);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedMemoryGame.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedMemoryGame.getGame().getName() + " - " + savedMemoryGame.getId());
	}
	
	@PutMapping("/memoryGame/{id}")   
	public ResponseEntity<?> updateMemoryGame(@RequestBody MemoryGame memoryGame, @PathVariable int id){
		Optional<MemoryGame> memoryGameFound = repository.findById(id);
		
		if(!memoryGameFound.isPresent())
			return ResponseEntity.notFound().build();
		
		memoryGame.setId(id);
		repository.save(memoryGame);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/memoryGame/{id}")
	public void deleteMemoryGame(@PathVariable int id) {
		Optional<MemoryGame> memoryGameFound = repository.findById(id);
		
		if(memoryGameFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
}