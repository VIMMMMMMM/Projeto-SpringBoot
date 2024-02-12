package com.primeiroprojeto.curso.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(Object id) {
        super("Resouce not found. id"+id);
    }
}

