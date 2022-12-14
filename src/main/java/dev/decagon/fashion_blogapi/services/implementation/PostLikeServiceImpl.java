package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.PostLike;
import dev.decagon.fashion_blogapi.entities.User;
import dev.decagon.fashion_blogapi.exceptions.EntityNotFoundException;
import dev.decagon.fashion_blogapi.repositories.PostLikeRepository;
import dev.decagon.fashion_blogapi.repositories.PostRepository;
import dev.decagon.fashion_blogapi.repositories.UserRepository;
import dev.decagon.fashion_blogapi.services.PostLikeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class PostLikeServiceImpl implements PostLikeService {
    private final PostLikeRepository postLikeRepository;
    private UserRepository userRepository;
    private PostRepository postRepository;
    @Override
    public PostLike getByPostAndUser(Post post, User user) {
        return postLikeRepository.getPostLikeByPostAndUser(post, user);
    }

    @Override
    public void addPostLike(Long userId, Long postId) {
        postLikeRepository.save(  PostLike.builder()
                .user(userRepository.findById(userId).orElseThrow(
                        ()-> new EntityNotFoundException("user unavailable")
                ))
                .post(postRepository.findById(postId).orElseThrow(
                        () -> new EntityNotFoundException(" this comment has not been saved")
                ))
                .build()
        );
    }

    @Override
    public void deletePostLike(Long postLikeId) {
postLikeRepository.deleteById(postLikeId);
    }

    @Override
    public List<PostLike> getAllPostLikeByPost(Post post) {

        return postLikeRepository.getPostLikeByPost(post);
    }
}
