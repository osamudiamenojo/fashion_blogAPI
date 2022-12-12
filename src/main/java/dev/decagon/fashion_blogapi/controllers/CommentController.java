package dev.decagon.fashion_blogapi.controllers;

import dev.decagon.fashion_blogapi.dtos.CommentCreationDto;
import dev.decagon.fashion_blogapi.dtos.CommentDto;
import dev.decagon.fashion_blogapi.services.CommentService;
import dev.decagon.fashion_blogapi.services.PostService;
import dev.decagon.fashion_blogapi.services.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@AllArgsConstructor
@RequestMapping("api/v1/comments")
public class CommentController {
    private final CommentService commentService;
    private PostService postService;
    private UserService userService;
    @PostMapping("/make-comment")
    public ResponseEntity<CommentDto> create(@Valid @RequestBody CommentCreationDto commentCreationDto){
        return new ResponseEntity<>(commentService.addComment(commentCreationDto), HttpStatus.CREATED);
    }
//    @PostMapping("/like-comment")
//    public void likeAComment()

}
