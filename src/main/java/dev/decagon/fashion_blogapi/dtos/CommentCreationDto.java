package dev.decagon.fashion_blogapi.dtos;

import lombok.Data;

@Data
public class CommentCreationDto {

    private String commentBody;
    private Long userId;
}
