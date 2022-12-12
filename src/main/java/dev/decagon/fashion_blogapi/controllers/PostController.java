package dev.decagon.fashion_blogapi.controllers;

import dev.decagon.fashion_blogapi.dtos.CommentCreationDto;
import dev.decagon.fashion_blogapi.dtos.CommentDto;
import dev.decagon.fashion_blogapi.dtos.PostCreationDto;
import dev.decagon.fashion_blogapi.dtos.PostDto;
import dev.decagon.fashion_blogapi.services.PostService;
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
@RequestMapping("api/v1/posts")
public class PostController {
    private PostService postService;

    @PostMapping("/make-comment")
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostCreationDto postCreationDto){
        return new ResponseEntity<>(postService.addPost(postCreationDto), HttpStatus.CREATED);
    }

}
