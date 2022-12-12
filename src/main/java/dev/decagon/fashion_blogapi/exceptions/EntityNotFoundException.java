package dev.decagon.fashion_blogapi.exceptions;

public class EntityNotFoundException extends RuntimeException {
    private String message;
    public EntityNotFoundException(String message) {
        super(message);
        this.message=message;
    }

    public EntityNotFoundException() {
        super("Not found");
    }
}
