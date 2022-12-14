package dev.decagon.fashion_blogapi.exceptions;

public class NoPermissionException extends RuntimeException{
    private String message;
    public NoPermissionException(String message) {
        super(message);
        this.message=message;
    }
    public NoPermissionException() {
        super("No Authorization");
    }
}
