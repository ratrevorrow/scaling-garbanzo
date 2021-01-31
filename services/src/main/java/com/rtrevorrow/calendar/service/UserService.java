package com.rtrevorrow.calendar.service;

import com.rtrevorrow.calendar.model.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;

    User createUser(User user);
}