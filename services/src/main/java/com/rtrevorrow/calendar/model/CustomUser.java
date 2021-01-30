package com.rtrevorrow.calendar.model;

import org.springframework.security.core.userdetails.User;

import java.io.Serializable;

public class CustomUser extends User implements Serializable {

    private static final long serialVersionUID = -3059139911382232782L;

    public CustomUser(UserEntity user) {
        super(user.getUsername(), user.getPassword(), user.getGrantedAuthoritiesList());
    }
}
