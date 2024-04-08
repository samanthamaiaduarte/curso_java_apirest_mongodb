package com.samanthamaiduarte.apirestmongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.samanthamaiduarte.apirestmongodb.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

	List<Post> findByTitleContainingIgnoreCase(String word);
	
	@Query(" { 'title': { $regex: ?0, $options: 'i' } } ")
	List<Post> searchByTitle(String text);
}
