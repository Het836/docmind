package com.het.docmind.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/chat")
@Tag(
        name = "Chat Management",
        description = "Endpoints for managing chat conversations"
)
public class ChatController {

    @PostMapping
    @Operation(
            summary = "Upload an index document(PDF, DOC, TXT, MD, CSV))",
            description = "This API is used to upload an index documents file."
    )
    public ResponseEntity<String> chat() {
        return ResponseEntity.ok("Chat response");
    }
}
