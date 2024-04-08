package com.samanthamaiduarte.apirestmongodb.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.samanthamaiduarte.apirestmongodb.domain.Post;
import com.samanthamaiduarte.apirestmongodb.domain.User;
import com.samanthamaiduarte.apirestmongodb.repository.PostRepository;
import com.samanthamaiduarte.apirestmongodb.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;

	@Override
	public void run(String... args) throws Exception {
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
		Post post1 = new Post(null, Instant.parse("2018-03-21T00:00:00Z"), "Partiu viagem", "Vou viajar pra São Paulo. Abraços!", maria);
		Post post2 = new Post(null, Instant.parse("2018-03-23T00:00:00Z"), "Bom dia", "Acordei feliz hoje!", maria);
		
		postRepository.saveAll(Arrays.asList(post1, post2));
		
	}

}
