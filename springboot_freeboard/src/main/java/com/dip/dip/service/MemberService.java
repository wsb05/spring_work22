package com.dip.dip.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MemberService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        System.out.println(email);
        System.out.println(passwordEncoder.encode("1234"));

        return User.builder()
                .username(email)
                .password(passwordEncoder.encode("1234"))
                .roles("ADMIN")
                .build();
    }

}
