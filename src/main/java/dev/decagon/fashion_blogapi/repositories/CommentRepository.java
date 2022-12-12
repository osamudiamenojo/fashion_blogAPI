package dev.decagon.fashion_blogapi.repositories;

import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.PostLike;
import dev.decagon.fashion_blogapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

}
