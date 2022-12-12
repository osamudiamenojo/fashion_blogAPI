package dev.decagon.fashion_blogapi.dtos;

import dev.decagon.fashion_blogapi.enums.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class UserCreationDto {
    private String name;
    private String email;
    private String password;
    private Role role;

}
