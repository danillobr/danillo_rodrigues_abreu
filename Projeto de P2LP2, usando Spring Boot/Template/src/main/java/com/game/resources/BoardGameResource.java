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

import com.game.domain.BoardGame;
import com.game.repository.BoardGameRepository;

@RestController
public class BoardGameResource {

	@Autowired
	private BoardGameRepository repository;
	
	@GetMapping("/boardGame")
	public List<BoardGame> getAllBoardGame() {
		List <BoardGame> boardGame = repository.findAll();
		return boardGame;
	}
	
	@PostMapping("/boardGame")
	public ResponseEntity<?>saveBoardGame(@RequestBody BoardGame boardGame) {
		BoardGame savedBoardGame = repository.save(boardGame);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedBoardGame.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedBoardGame.getGame().getName() + " - " + savedBoardGame.getId());
	}
	
	@PutMapping("/boardGame/{id}")   
	public ResponseEntity<?> updateBoardGame(@RequestBody BoardGame boardGame, @PathVariable int id){
		Optional<BoardGame> boardGameFound = repository.findById(id);
		
		if(!boardGameFound.isPresent())
			return ResponseEntity.notFound().build();
		
		boardGame.setId(id);
		repository.save(boardGame);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/boardGame/{id}")
	public void deleteBoardGame(@PathVariable int id) {
		Optional<BoardGame> boardGameFound = repository.findById(id);
		
		if(boardGameFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
	
}