package com.krzysiek.arena;

public class NoBodyPartException extends RuntimeException {
    public NoBodyPartException() {
        super();
    }

    public NoBodyPartException(String message) {
        super(message);
    }
}
