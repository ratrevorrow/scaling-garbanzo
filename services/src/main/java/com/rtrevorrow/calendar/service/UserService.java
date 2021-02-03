package com.rtrevorrow.calendar.service;

import com.rtrevorrow.calendar.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User createUser(User user);
}