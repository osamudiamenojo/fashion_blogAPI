package dev.decagon.fashion_blogapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.decagon.fashion_blogapi.enums.Role;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "Users")
@Table(name = "users")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends BaseEntity{
    private String name;
    private String email;
    private String password;
    @Column(nullable = false)
    @Enumerated(value=EnumType.STRING)
    private Role role;
    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Post> posts;
    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    
    private List<Comment> comments;
    @OneToMany(
            mappedBy = "user",
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<PostLike> postLikes;
}
