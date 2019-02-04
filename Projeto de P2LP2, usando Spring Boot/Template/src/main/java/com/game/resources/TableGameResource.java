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

import com.game.domain.TableGame;
import com.game.repository.TableGameRepository;

@RestController
public class TableGameResource {

	@Autowired
	private TableGameRepository repository;
	
	@GetMapping("/tableGame")
	public List<TableGame> getAllTableGame() {
		List <TableGame> tableGame = repository.findAll();
		return tableGame;
	}
	
	@PostMapping("/tableGame")
	public ResponseEntity<?>saveTableGame(@RequestBody TableGame tableGame) {
		TableGame savedTableGame = repository.save(tableGame);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedTableGame.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedTableGame.getGame().getName() + " - " + savedTableGame.getId());
	}
	
	@PutMapping("/tableGame/{id}")   
	public ResponseEntity<?> updateTableGame(@RequestBody TableGame tableGame, @PathVariable int id){
		Optional<TableGame> tableGameFound = repository.findById(id);
		
		if(!tableGameFound.isPresent())
			return ResponseEntity.notFound().build();
		
		tableGame.setId(id);
		repository.save(tableGame);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/tableGame/{id}")
	public void deleteTableGame(@PathVariable int id) {
		Optional<TableGame> tableGameFound = repository.findById(id);
		
		if(tableGameFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
}