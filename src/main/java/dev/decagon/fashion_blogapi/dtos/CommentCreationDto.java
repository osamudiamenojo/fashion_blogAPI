package dev.decagon.fashion_blogapi.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CommentCreationDto {
    @NotNull(message="comment cannot be null")
    private String commentBody;
    @NotNull(message="ID of commenter required")
    private Long userId;
    private Long postId;
}
