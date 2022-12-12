package dev.decagon.fashion_blogapi.repositories;

import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.PostLike;
import dev.decagon.fashion_blogapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PostLikeRepository extends JpaRepository<PostLike, Long> {
    PostLike getPostLikeByPostAndUser(Post post, User user);

    List<PostLike> getPostLikeByPost(Post post);
}
