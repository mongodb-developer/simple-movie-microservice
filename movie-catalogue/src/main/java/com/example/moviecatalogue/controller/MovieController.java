package com.example.moviecatalogue.controller;

import org.springframework.web.bind.annotation.*;

import com.example.moviecatalogue.model.Movie;
import com.example.moviecatalogue.repository.MovieRepository;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    
	private final MovieRepository movieRepository;

	public MovieController(MovieRepository movieRepository) {
		this.movieRepository = movieRepository;
	}
    
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable String id) {
        return movieRepository.findById(id).orElse(null);
    }

    @GetMapping("/search/{query}")
    public List<Movie> searchMovies(@PathVariable String query) {
        return movieRepository.findByTitleContaining(query);
    }
    
}
