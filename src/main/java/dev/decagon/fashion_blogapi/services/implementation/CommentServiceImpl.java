package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.dtos.CommentCreationDto;
import dev.decagon.fashion_blogapi.dtos.CommentDto;
import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.exceptions.EntityNotFoundException;
import dev.decagon.fashion_blogapi.repositories.CommentRepository;
import dev.decagon.fashion_blogapi.repositories.UserRepository;
import dev.decagon.fashion_blogapi.services.CommentService;
import dev.decagon.fashion_blogapi.services.PostService;
import dev.decagon.fashion_blogapi.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommentServiceImpl implements CommentService {
    private final CommentRepository commentRepository;
    private final UserRepository userRepository;
    private PostService postService;
    @Override
    public CommentDto addComment(CommentCreationDto commentCreationDto) {
       return Mapper.commentToDto(commentRepository.save(
                Comment.builder()
                        .commentBody(commentCreationDto.getCommentBody())
                        .post(postService.getPostById(commentCreationDto.getPostId()).orElseThrow(() -> new EntityNotFoundException("post doesn't exist")))
                        .user(userRepository.findById(commentCreationDto.getUserId()).orElseThrow(() -> new EntityNotFoundException("this user doesn't exist in the database")))
                        .build()
        ));
    }

    @Override
    public Comment getCommentById(Long commentId) {
        return commentRepository.findById(commentId).orElseThrow(
                ()-> new EntityNotFoundException("No comment with this ID in database"));
    }

    @Override
    public void deleteComment(Long commentId) {
        commentRepository.deleteById(commentId);

    }
    //ch
}
