package com.example.exception;

public class EmployNoAlreadyExistsException extends RuntimeException {
    public EmployNoAlreadyExistsException(String message) {
        super(message);
    }
}
