package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.entities.CommentLike;
import dev.decagon.fashion_blogapi.entities.User;
import dev.decagon.fashion_blogapi.exceptions.EntityNotFoundException;
import dev.decagon.fashion_blogapi.repositories.CommentLikeRepository;
import dev.decagon.fashion_blogapi.repositories.CommentRepository;
import dev.decagon.fashion_blogapi.repositories.UserRepository;
import dev.decagon.fashion_blogapi.services.CommentLikeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class CommentLikeServiceImpl implements CommentLikeService {
    private  CommentLikeRepository commentLikeRepository;
    private UserRepository userRepository;
    private CommentRepository commentRepository;
    @Override
    public CommentLike getByCommentAndUser(Comment comment, User user) {
        return commentLikeRepository.findCommentLikeByCommentAndAndUser(comment, user);
    }
    @Override
    public void addCommentLike(Long userId, Long commentId) {
      commentLikeRepository.save(  CommentLike.builder()
                .user(userRepository.findById(userId).orElseThrow(
                        ()-> new EntityNotFoundException("user unavailable")
                ))
                .comment(commentRepository.findById(commentId).orElseThrow(
                        () -> new EntityNotFoundException(" this comment has not been saved")
                ))
                .build()
      );
    }
    @Override
    public void deleteCommentLike(Long likeId) {
        commentLikeRepository.deleteById(likeId);
    }
    @Override
    public List<CommentLike> getAllCommentLikesByComment(Comment comment) {

        return commentLikeRepository.findCommentLikesByComment(comment);
    }
}
