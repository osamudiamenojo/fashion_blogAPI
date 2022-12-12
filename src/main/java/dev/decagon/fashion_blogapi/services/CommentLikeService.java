package dev.decagon.fashion_blogapi.services;

import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.entities.CommentLike;
import dev.decagon.fashion_blogapi.entities.User;

import java.util.List;

public interface CommentLikeService {
    CommentLike getByCommentAndUser(Comment comment, User user);

    void addCommentLike(Long userId, Long commentId);

    void deleteCommentLike(Long likeId);


    List<CommentLike> getAllCommentLikesByComment(Comment comment);


}
