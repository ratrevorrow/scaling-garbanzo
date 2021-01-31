package com.rtrevorrow.calendar.model;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_SUPER_ADMIN, ROLE_ADMIN, ROLE_CLIENT;

    public String getAuthority() {
        return name();
    }
}
