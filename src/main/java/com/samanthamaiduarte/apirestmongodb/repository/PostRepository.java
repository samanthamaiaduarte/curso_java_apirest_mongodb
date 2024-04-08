package com.samanthamaiduarte.apirestmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.samanthamaiduarte.apirestmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
