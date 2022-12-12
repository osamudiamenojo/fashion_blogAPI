package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.PostLike;
import dev.decagon.fashion_blogapi.entities.User;
import dev.decagon.fashion_blogapi.repositories.PostLikeRepository;
import dev.decagon.fashion_blogapi.services.PostLikeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PostLikeServiceImpl implements PostLikeService {
    private final PostLikeRepository postLikeRepository;
    @Override
    public PostLike getByPostAndUser(Post post, User user) {
        return postLikeRepository.getPostLikeByPostAndUser(post, user);
    }

    @Override
    public void addPostLike(PostLike postLike) {
    postLikeRepository.save(postLike);
    }

    @Override
    public void deletePostLike(PostLike like) {
postLikeRepository.delete(like);
    }

    @Override
    public List<PostLike> getAllPostLikeByPost(Post post) {

        return postLikeRepository.getPostLikeByPost(post);
    }
}
