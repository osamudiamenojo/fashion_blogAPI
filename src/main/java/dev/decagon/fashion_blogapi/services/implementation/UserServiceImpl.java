package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.dtos.UserCreationDto;
import dev.decagon.fashion_blogapi.dtos.UserDto;
import dev.decagon.fashion_blogapi.entities.User;
import dev.decagon.fashion_blogapi.exceptions.EntityNotFoundException;
import dev.decagon.fashion_blogapi.repositories.UserRepository;
import dev.decagon.fashion_blogapi.services.UserService;
import dev.decagon.fashion_blogapi.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    @Override
    public UserDto addUser(UserCreationDto signUpRequest) {

         return Mapper.userToUserDto(userRepository.save(
                 User.builder()
                         .name(signUpRequest.getName())
                         .email(signUpRequest.getEmail())
                         .password(signUpRequest.getPassword())
                         .role(signUpRequest.getRole())
                         .build()
         ));
    }
    @Override
    public UserDto getUserByEmail(String email) {

        return Mapper.userToUserDto(userRepository.findUsersByEmail(email));
    }

    @Override
    public List<User> findAll() {

        return userRepository.findAll();
    }

    @Override
    public UserDto getUserById(Long id) {
return Mapper.userToUserDto(userRepository.findById(id).orElseThrow(
        ()-> new EntityNotFoundException("User Not Found")
));
    }
}
