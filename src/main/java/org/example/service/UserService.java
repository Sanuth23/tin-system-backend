package org.example.service;

import org.example.dto.User;
import org.example.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity createUser(User user);

    String generateTin(Long id);

//    List getUsers();
}
