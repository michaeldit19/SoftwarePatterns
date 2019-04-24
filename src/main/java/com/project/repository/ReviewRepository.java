package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Review;

public interface ReviewRepository extends CrudRepository<Review, String> {

}
