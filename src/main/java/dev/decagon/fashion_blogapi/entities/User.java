package dev.decagon.fashion_blogapi.entities;

import dev.decagon.fashion_blogapi.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity(name = "Users")
@Table(name = "users")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    private String name;
    private String email;
    private Role role;
}
