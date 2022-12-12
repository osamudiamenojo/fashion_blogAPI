package dev.decagon.fashion_blogapi.repositories;

import dev.decagon.fashion_blogapi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findUsersByEmail(String email);
}
