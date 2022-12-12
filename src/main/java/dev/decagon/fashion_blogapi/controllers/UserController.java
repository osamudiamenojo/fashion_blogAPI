package dev.decagon.fashion_blogapi.controllers;

import dev.decagon.fashion_blogapi.dtos.UserCreationDto;
import dev.decagon.fashion_blogapi.dtos.UserDto;
import dev.decagon.fashion_blogapi.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/comments")
public class UserController {
    private final UserService userService;
    @PostMapping("/new")
    public ResponseEntity<UserDto> register(@Valid @RequestBody UserCreationDto signUpRequest){
        return new ResponseEntity<>(userService.addUser(signUpRequest), HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Long id){
        return new ResponseEntity<>(userService.getUserById(id),HttpStatus.ACCEPTED);
    }

}
