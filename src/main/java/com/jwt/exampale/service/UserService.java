package com.jwt.exampale.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.exampale.models.User;

@Service
public class UserService {

	private List<User> store=new ArrayList<>();

	public UserService() {
		store.add(new User(UUID.randomUUID().toString(), "aamir ali", "aamir@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),  "rahul kumar" ,"rahul@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),  "raj " , "raj@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(),  "sonu verma" , "sonu@gmail.com"));
	
	}
	public List<User> getUsers(){
		return this.store;
	}

	
	
	
}
