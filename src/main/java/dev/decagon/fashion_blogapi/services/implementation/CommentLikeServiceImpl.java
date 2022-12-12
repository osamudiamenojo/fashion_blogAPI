package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.entities.CommentLike;
import dev.decagon.fashion_blogapi.entities.User;
import dev.decagon.fashion_blogapi.repositories.CommentLikeRepository;
import dev.decagon.fashion_blogapi.services.CommentLikeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CommentLikeServiceImpl implements CommentLikeService {
    private final CommentLikeRepository commentLikeRepository;
    @Override
    public CommentLike getByCommentAndUser(Comment comment, User user) {
        return commentLikeRepository.findCommentLikeByCommentAndAndUser(comment, user);
    }
    @Override
    public void addCommentLike(CommentLike commentLike) {
        commentLikeRepository.save(commentLike);
    }
    @Override
    public void deleteCommentLike(CommentLike like) {
        commentLikeRepository.delete(like);
    }
    @Override
    public List<CommentLike> getAllCommentLikesByComment(Comment comment) {

        return commentLikeRepository.findCommentLikesByComment(comment);
    }
}
