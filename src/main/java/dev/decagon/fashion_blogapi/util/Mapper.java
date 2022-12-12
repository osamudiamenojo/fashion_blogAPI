package dev.decagon.fashion_blogapi.util;

import dev.decagon.fashion_blogapi.dtos.CommentDto;
import dev.decagon.fashion_blogapi.dtos.PostDto;
import dev.decagon.fashion_blogapi.dtos.UserDto;
import dev.decagon.fashion_blogapi.entities.Comment;
import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.User;

public class Mapper {
    public static UserDto userToUserDto(User user){
        return UserDto.builder()
                .id(user.getId())
                .name(user.getName())
                .email(user.getEmail())
                .build();
    }
    public static PostDto postToPostDto(Post post){
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .description(post.getDescription())
                .category(post.getCategory())
                .imageUrl(post.getImageUrl())
                .createdAt(post.getCreatedAt())
                .build();
    }
    public static CommentDto commentToDto(Comment comment) {
        return CommentDto.builder()
                .id(comment.getId())
                .commentBody(comment.getCommentBody())
                .build();
    }
}
