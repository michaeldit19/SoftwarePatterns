package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Card;

public interface CardRepository extends CrudRepository<Card, String> {

}
