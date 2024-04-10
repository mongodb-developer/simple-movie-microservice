package com.example.moviecatalogue.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.moviecatalogue.model.Movie;

public interface MovieRepository extends MongoRepository<Movie, String> {
    List<Movie> findByTitleContaining(String title);
}
