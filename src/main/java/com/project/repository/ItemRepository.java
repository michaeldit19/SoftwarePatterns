package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Item;

public interface ItemRepository extends CrudRepository<Item, String>{

}
