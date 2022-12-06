package dev.decagon.fashion_blogapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FashionBlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FashionBlogApiApplication.class, args);
    }

}
