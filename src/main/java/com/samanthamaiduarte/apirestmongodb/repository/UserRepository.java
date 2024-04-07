package com.samanthamaiduarte.apirestmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samanthamaiduarte.apirestmongodb.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

}
