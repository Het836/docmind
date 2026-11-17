package com.het.docmind.exception;

public class DocumentProcessingException extends RuntimeException{

    public DocumentProcessingException(String message) {
        super(message);
    }

    public DocumentProcessingException(){
        super("Failed to process document");
    }

    public DocumentProcessingException(String message, Throwable cause) {
        super(message, cause);
    }
}
