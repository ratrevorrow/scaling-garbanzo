package com.rtrevorrow.calendar.service.impl;

import com.rtrevorrow.calendar.model.User;
import com.rtrevorrow.calendar.repository.UserRepository;
import com.rtrevorrow.calendar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service//("UserServiceImpl")
public class UserServiceImpl implements UserDetailsService, UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        System.out.println("loadUserByUsername");
        return null;
    }

    @Override
    public User createUser(User user) {
        User dbUser = userRepository.findByUsername(user.getUsername()).orElse(null);

        if (Objects.nonNull(dbUser)) {
            throw new IllegalArgumentException("User already exists");
        }

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        user.setPassword(null);

        return user;
    }
}
