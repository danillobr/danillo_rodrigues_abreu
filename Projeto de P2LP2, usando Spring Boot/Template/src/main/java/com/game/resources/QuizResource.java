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

import com.game.domain.Quiz;
import com.game.repository.QuizRepository;

@RestController
public class QuizResource {

	@Autowired
	private QuizRepository repository;
	
	@GetMapping("/quiz")
	public List<Quiz> getAllVideoGame() {
		List <Quiz> quiz = repository.findAll();
		return quiz;
	}
	
	@PostMapping("/quiz")
	public ResponseEntity<?>saveQuiz(@RequestBody Quiz quiz) {
		Quiz savedQuiz = repository.save(quiz);
		
		URI uri = ServletUriComponentsBuilder.
				fromCurrentRequest().
				path("/{id}").
				buildAndExpand(savedQuiz.getId()).
				toUri();
		
		return ResponseEntity.created(uri).
				body("Nome e ID do novo jogo: " + 
				savedQuiz.getGame().getName() + " - " + savedQuiz.getId());
	}
	
	@PutMapping("/quiz/{id}")   
	public ResponseEntity<?> updateQuiz(@RequestBody Quiz quiz, @PathVariable int id){
		Optional<Quiz> quizFound = repository.findById(id);
		
		if(!quizFound.isPresent())
			return ResponseEntity.notFound().build();
		
		quiz.setId(id);
		repository.save(quiz);
		
		return ResponseEntity.noContent().build();
	}
	
	@DeleteMapping("/quiz/{id}")
	public void deleteQuiz(@PathVariable int id) {
		Optional<Quiz> quizFound = repository.findById(id);
		
		if(quizFound.isPresent()) {
			repository.deleteById(id);
		}
	}
	
	
}