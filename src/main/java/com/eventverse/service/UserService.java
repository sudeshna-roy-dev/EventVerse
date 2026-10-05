package com.eventverse.service;

import com.eventverse.domain.user.Role;
import com.eventverse.domain.user.User;
import com.eventverse.dto.user.RegisterRequest;
import com.eventverse.dto.user.UserResponse;
import com.eventverse.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse register(RegisterRequest request) {

        User user = new User();

        user.setName(request.getName());
        user.setEmail(request.getEmail());
        user.setPasswordHash(request.getPassword());
        user.setRole(Role.CUSTOMER);
        user.setStatus("ACTIVE");

        User savedUser = userRepository.save(user);

        UserResponse response = new UserResponse();
        response.setId(savedUser.getId());
        response.setName(savedUser.getName());
        response.setEmail(savedUser.getEmail());
        response.setRole(savedUser.getRole());

        return response;
    }
}