package dev.decagon.fashion_blogapi.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Post")
@Table(name = "post")
public class Post extends BaseEntity{
    private String title;
    private String category;
    private String imageUrl;
    private  String description;

    @OneToMany(
            mappedBy = "post",
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Comment>  comment;

    @OneToMany(
            mappedBy = "post",
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<Like> likes;


}
