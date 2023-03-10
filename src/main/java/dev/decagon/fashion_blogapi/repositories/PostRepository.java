package dev.decagon.fashion_blogapi.repositories;

import dev.decagon.fashion_blogapi.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
}
