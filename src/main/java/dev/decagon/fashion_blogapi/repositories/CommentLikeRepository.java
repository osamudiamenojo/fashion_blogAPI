package dev.decagon.fashion_blogapi.repositories;

import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.entities.CommentLike;
import dev.decagon.fashion_blogapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface CommentLikeRepository extends JpaRepository<CommentLike, Long> {
    CommentLike findCommentLikeByCommentAndAndUser(Comment comment, User user);
    List<CommentLike> findCommentLikesByComment(Comment comment);
}
