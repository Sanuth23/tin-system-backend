package org.example.service;

import org.example.dto.User;
import org.example.entity.UserEntity;

public interface UserService {
    UserEntity createUser(User user);

//    String generateTin();
}
