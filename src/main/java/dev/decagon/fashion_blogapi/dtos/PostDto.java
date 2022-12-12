package dev.decagon.fashion_blogapi.dtos;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
@Builder
public class PostDto {
    private Long id;
    private String title;
    private String category;
    private String imageUrl;
    private  String description;
    private Timestamp createdAt;
}
