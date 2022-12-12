package dev.decagon.fashion_blogapi.dtos;

import dev.decagon.fashion_blogapi.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class UserCreationDto {
    @NotNull(message="name cannot be null")
    @Size(min=2, message="name must be more than 1 letter")
    private String name;
    @Email
    private String email;

    @Size(min=2, max=12, message="password must be between 2 and 12 characters")
    private String password;
    private Role role;

}
