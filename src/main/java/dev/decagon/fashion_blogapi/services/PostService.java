package dev.decagon.fashion_blogapi.services;

import dev.decagon.fashion_blogapi.dtos.PostCreationDto;
import dev.decagon.fashion_blogapi.dtos.PostDto;
import dev.decagon.fashion_blogapi.entities.Post;

import java.util.Optional;

public interface PostService {

    PostDto addPost(PostCreationDto postCreationRequest);

    Optional<Post> getPostById(Long id);

    void deletePost(Long postId);

}
