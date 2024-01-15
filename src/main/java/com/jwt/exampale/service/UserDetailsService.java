package com.jwt.exampale.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface UserDetailsService {

	UserDetails LoaduserByUsername(String username) throws UsernameNotFoundException;
	
}
