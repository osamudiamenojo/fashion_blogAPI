package dev.decagon.fashion_blogapi.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Post")
@Table(name = "post")
public class Post extends BaseEntity{
    private String title;
    private String category;
    private String imageUrl;
    private  String description;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
    @OneToMany(
            mappedBy = "post",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Comment>  comments;
    @OneToMany(
            mappedBy = "post",
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<PostLike> postLikes;


}
