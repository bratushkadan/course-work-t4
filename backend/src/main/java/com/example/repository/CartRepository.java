package com.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.example.model.Cart;

public interface CartRepository extends MongoRepository<Cart, String> {
  @Query("{ 'userId' : ?0 }")
  Cart findByUserId(String userId);
}
