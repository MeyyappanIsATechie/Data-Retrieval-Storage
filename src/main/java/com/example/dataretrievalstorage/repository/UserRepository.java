package com.example.dataretrievalstorage.repository;

import com.example.dataretrievalstorage.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
