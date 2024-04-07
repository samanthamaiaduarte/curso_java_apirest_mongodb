package com.samanthamaiduarte.apirestmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samanthamaiduarte.apirestmongodb.domain.User;
import com.samanthamaiduarte.apirestmongodb.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
}
