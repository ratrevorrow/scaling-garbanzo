package com.rtrevorrow.calendar.controller;

import com.rtrevorrow.calendar.model.User;
import com.rtrevorrow.calendar.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

//    @GetMapping("/list")
//    public Page<CustomUser> list(@PageableDefault(size = Integer.MAX_VALUE) Pageable pageable, OAuth2Authentication authentication) {
//
//    }
    @PostMapping("/create")
    public User createUser(@Validated @RequestBody User user) {
        return userService.createUser(user);
    }
}
