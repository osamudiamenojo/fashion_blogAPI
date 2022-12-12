package dev.decagon.fashion_blogapi.dtos;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostCreationDto {
    private String title;
    private String category;
    private String imageUrl;
    private  String description;
    private Long userId;
}
