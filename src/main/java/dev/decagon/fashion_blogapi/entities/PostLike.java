package dev.decagon.fashion_blogapi.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Likes")
@Table(name = "likes")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostLike extends BaseEntity{
    @ManyToOne(targetEntity = Post.class)
    @JoinColumn(
            name = "post_id",
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "comment_post_id_fk"
            )
    )
    private Post post;
    @JoinColumn(name = "user_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
}
