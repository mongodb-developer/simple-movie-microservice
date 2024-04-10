package com.example.reviews.controller;

import com.example.reviews.model.Review;
import com.example.reviews.repository.ReviewRepository;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/reviews")
public class ReviewController {

    private final ReviewRepository reviewRepository;
    private final RestTemplate restTemplate;

    public ReviewController(ReviewRepository reviewRepository, RestTemplate restTemplate) {
        this.reviewRepository = reviewRepository;
        this.restTemplate = restTemplate;
    }
    
    @GetMapping
    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<?> addReview(@RequestBody Review review) {
        if (!doesUserExist(review.getUserId())) {
            return ResponseEntity.badRequest().body("User does not exist");
        }

        if (!doesMovieExist(review.getMovieId())) {
            return ResponseEntity.badRequest().body("Movie does not exist");
        }

        return ResponseEntity.ok(reviewRepository.save(review));
    }

    private boolean doesUserExist(String userId) {
        try {
        	restTemplate.getForEntity("http://user-management-service/users/" + userId, String.class);
            return true;
        } catch (HttpClientErrorException.NotFound e) {
            return false;
        }
    }

    private boolean doesMovieExist(String movieId) {
        try {
            restTemplate.getForEntity("http://movie-catalogue-service/movies/" + movieId, String.class);
            return true;
        } catch (HttpClientErrorException.NotFound e) {
            return false;
        }
    }

}