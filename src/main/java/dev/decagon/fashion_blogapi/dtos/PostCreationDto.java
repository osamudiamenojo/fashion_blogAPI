package dev.decagon.fashion_blogapi.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PostCreationDto {
    private String title;
    @NotNull(message = "Post Category cannot be empty")
    private String category;
    private String imageUrl;
    @NotNull(message = "Post description cannot be empty")
    private  String description;
    private Long userId;
}
