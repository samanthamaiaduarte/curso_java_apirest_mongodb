package com.samanthamaiduarte.apirestmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samanthamaiduarte.apirestmongodb.domain.Post;
import com.samanthamaiduarte.apirestmongodb.repository.PostRepository;
import com.samanthamaiduarte.apirestmongodb.services.exception.ObjectNotFoundException;

@Service
public class PostService {
	
	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> post = repository.findById(id);
		return post.orElseThrow(() -> new ObjectNotFoundException("Object not found! Id: " + id));
	}
	
	public List<Post> findByTitle(String word) {
		//return repository.findByTitleContainingIgnoreCase(word);
		return repository.searchByTitle(word);
	}
	
}
