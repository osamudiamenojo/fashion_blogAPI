package dev.decagon.fashion_blogapi.services;

import dev.decagon.fashion_blogapi.dtos.CommentCreationDto;
import dev.decagon.fashion_blogapi.dtos.CommentDto;
import dev.decagon.fashion_blogapi.entities.Comment;

public interface CommentService {

    CommentDto addComment(CommentCreationDto comment);

    Comment getCommentById(Long commentId);

    void deleteComment(Long commentId);

}
