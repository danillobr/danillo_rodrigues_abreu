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

import com.game.domain.VideoGame;
import com.game.repository.VideoGameRepository;

@RestController
public class VideoGameResource {

	@Autowired
	private VideoGameRepository repository;
	
	@GetMapping("/videoGames")
	public List<VideoGame> getAllVideoGame() {
		List <VideoGame> games = repository.findAll();
		return games;
	}
	
	@PostMapping("/videoGames")
	public ResponseEntity<?>saveVideoGame(@RequestBody VideoGame game) {
		VideoGame savedVideoGame = repository.save(game);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedVideoGame.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedVideoGame.getGame().getName() + " - " + savedVideoGame.getId());
	}
	
	@PutMapping("/videoGames/{id}")   
	public ResponseEntity<?> updateVideoGame(@RequestBody VideoGame game, @PathVariable int id){
		Optional<VideoGame> videoGameFound = repository.findById(id);
		
		if(!videoGameFound.isPresent())
			return ResponseEntity.notFound().build();
		
		game.setId(id);
		repository.save(game);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/videoGames/{id}")
	public void deleteGame(@PathVariable int id) {
		Optional<VideoGame> videoGameFound = repository.findById(id);
		
		if(videoGameFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
	
}