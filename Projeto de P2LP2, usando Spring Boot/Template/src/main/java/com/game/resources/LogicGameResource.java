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

import com.game.domain.LogicGame;
import com.game.repository.LogicGameRepository;

@RestController
public class LogicGameResource {

	@Autowired
	private LogicGameRepository repository;
	
	@GetMapping("/logicGame")
	public List<LogicGame> getAllVideoLogicGame() {
		List <LogicGame> logicGame = repository.findAll();
		return logicGame;
	}
	
	@PostMapping("/logicGame")
	public ResponseEntity<?>saveLogicGame(@RequestBody LogicGame logicGame) {
		LogicGame savedLogicGame = repository.save(logicGame);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedLogicGame.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedLogicGame.getGame().getName() + " - " + savedLogicGame.getId());
	}
	
	@PutMapping("/logicGame/{id}")   
	public ResponseEntity<?> updateLogicGame(@RequestBody LogicGame logicGame, @PathVariable int id){
		Optional<LogicGame> logicGameFound = repository.findById(id);
		
		if(!logicGameFound.isPresent())
			return ResponseEntity.notFound().build();
		
		logicGame.setId(id);
		repository.save(logicGame);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/logicGame/{id}")
	public void deleteLogicGame(@PathVariable int id) {
		Optional<LogicGame> logicGameFound = repository.findById(id);
		
		if(logicGameFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
	
}