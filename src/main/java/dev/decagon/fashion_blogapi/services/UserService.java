package dev.decagon.fashion_blogapi.services;

import dev.decagon.fashion_blogapi.dtos.UserCreationDto;
import dev.decagon.fashion_blogapi.dtos.UserDto;
import dev.decagon.fashion_blogapi.entities.User;

import java.util.List;

public interface UserService {
    UserDto addUser(UserCreationDto request);
    UserDto getUserByEmail(String email);
    List<User> findAll();
    UserDto getUserById(Long id);
}
