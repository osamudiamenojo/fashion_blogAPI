package dev.decagon.fashion_blogapi.services;

import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.PostLike;
import dev.decagon.fashion_blogapi.entities.User;

import java.util.List;

public interface PostLikeService {

    PostLike getByPostAndUser(Post post, User user);

    void addPostLike(PostLike postLike);

    void deletePostLike(PostLike like);


    List<PostLike> getAllPostLikeByPost(Post post);
}
