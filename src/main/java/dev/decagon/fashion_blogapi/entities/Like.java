package dev.decagon.fashion_blogapi.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "Likes")
@Table(name = "likes")
@Data
public class Like extends BaseEntity{
    @ManyToOne(targetEntity = Post.class)
    @JoinColumn(
            name = "post_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "comment_post_id_fk"
            )
    )
    private Post post;

    private Long userId;
}
