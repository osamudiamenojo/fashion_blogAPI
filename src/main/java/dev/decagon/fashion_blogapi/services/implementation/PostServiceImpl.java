package dev.decagon.fashion_blogapi.services.implementation;

import dev.decagon.fashion_blogapi.dtos.PostCreationDto;
import dev.decagon.fashion_blogapi.dtos.PostDto;
import dev.decagon.fashion_blogapi.entities.Post;
import dev.decagon.fashion_blogapi.entities.User;
import dev.decagon.fashion_blogapi.enums.Role;
import dev.decagon.fashion_blogapi.exceptions.EntityNotFoundException;
import dev.decagon.fashion_blogapi.exceptions.NoPermissionException;
import dev.decagon.fashion_blogapi.repositories.PostRepository;
import dev.decagon.fashion_blogapi.repositories.UserRepository;
import dev.decagon.fashion_blogapi.services.PostService;
import dev.decagon.fashion_blogapi.util.Mapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
@AllArgsConstructor
public class PostServiceImpl implements PostService {
    private  PostRepository postRepository;
    private  UserRepository userRepository;
    @Override
    public PostDto addPost(PostCreationDto postCreationRequest) {
        User admin= userRepository.findById(postCreationRequest.getUserId()).orElseThrow(()->new EntityNotFoundException("user does not exist"));
        if(admin.getRole()== Role.ADMIN) {
            return Mapper.postToPostDto(postRepository.save(
                    Post.builder()
                            .title(postCreationRequest.getTitle())
                            .description(postCreationRequest.getDescription())
                            .category(postCreationRequest.getCategory())
                            .imageUrl(postCreationRequest.getImageUrl())
                            .user(userRepository.findById(postCreationRequest.getUserId()).orElseThrow(() -> new EntityNotFoundException("user does not exist")))
                            .build()
            ));
        }
          throw new NoPermissionException("Only admins can post");
    }

    @Override
    public Optional<Post> getPostById(Long id) {

        return postRepository.findById(id);
    }

    @Override
    public void deletePost(Long postId) {
        postRepository.deleteById(postId);

    }
}
