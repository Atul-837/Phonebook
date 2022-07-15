package com.devAk;

public class ContactNotFoundException extends RuntimeException{
    public ContactNotFoundException() {
    }

    public ContactNotFoundException(String message) {
        super(message);
    }
}
