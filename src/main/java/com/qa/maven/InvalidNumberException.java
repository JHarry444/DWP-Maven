package com.qa.maven;

public class InvalidNumberException extends RuntimeException{
    public InvalidNumberException() {
    }

    public InvalidNumberException(String message) {
        super(message);
    }

    public InvalidNumberException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidNumberException(Throwable cause) {
        super(cause);
    }

    public InvalidNumberException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
