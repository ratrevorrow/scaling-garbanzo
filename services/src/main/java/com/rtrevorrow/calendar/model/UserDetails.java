package com.rtrevorrow.calendar.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.HashSet;

@NoArgsConstructor
@Data
public class UserDetails implements org.springframework.security.core.userdetails.UserDetails {

    private static final long serialVersionUID = -9217251852685828361L;

    private Collection<GrantedAuthority> authorities = new HashSet<>();
    private String password;
    private String username;
    private boolean isAccountNonExpired = false;
    private boolean isCredentialsNonExpired = false;
    private boolean isEnabled = false;
    private boolean isAccountNonLocked = false;
}
