package com.rtrevorrow.calendar.service.impl;

import com.rtrevorrow.calendar.model.User;
import com.rtrevorrow.calendar.repository.UserRepository;
import com.rtrevorrow.calendar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public User createUser(User user) {
        userRepository.findByUsername(user.getUsername())
                .orElseThrow(() -> new IllegalArgumentException("User already exists"));

        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);

        user.setPassword(null);

        return user;
    }
}
