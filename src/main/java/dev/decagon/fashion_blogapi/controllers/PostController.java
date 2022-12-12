package dev.decagon.fashion_blogapi.controllers;

import dev.decagon.fashion_blogapi.dtos.PostCreationDto;
import dev.decagon.fashion_blogapi.dtos.PostDto;
import dev.decagon.fashion_blogapi.services.PostLikeService;
import dev.decagon.fashion_blogapi.services.PostService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/posts")
public class PostController {
    private PostService postService;
    private PostLikeService postLikeService;

    @PostMapping("/make-post")
    public ResponseEntity<PostDto> createPost(@Valid @RequestBody PostCreationDto postCreationDto){
        return new ResponseEntity<>(postService.addPost(postCreationDto), HttpStatus.CREATED);
    }

    @PostMapping("like/{postId}/{userId}")
    public void likePost(@PathVariable Long postId, @PathVariable Long userId) {
        postLikeService.addPostLike(userId, userId);
    }

    @DeleteMapping("/delete/{postId}")
    public void deletePost(@PathVariable Long postId) {
        postService.deletePost(postId);
    }
    @DeleteMapping("unlike/{postLikeId}")
    public void unlikePost(@PathVariable Long postLikeId){
        postLikeService.deletePostLike(postLikeId);

    }
}
