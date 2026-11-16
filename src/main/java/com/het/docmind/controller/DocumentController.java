package com.het.docmind.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/documents")
@Tag(
        name="Documents Management",
        description = "Endpoints for uploading, listing, and managing documents and their vectors embeddings"
)
public class DocumentController {

    @PostMapping
    public ResponseEntity<String> uploadDocument() {
        // Implementation for uploading a document
        return ResponseEntity.ok("Document uploaded successfully");
    }
}
