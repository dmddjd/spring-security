package com.study.spring_security.service;

import com.study.spring_security.dto.CustomUserDetails;
import com.study.spring_security.entity.UserEntity;
import com.study.spring_security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userData = userRepository.findByUsername(username);
        if(userData != null){
            return new CustomUserDetails(userData);
        }
        return null;
    }
}
