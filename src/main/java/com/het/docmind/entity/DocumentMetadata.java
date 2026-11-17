package com.het.docmind.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "document_metadata")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class DocumentMetadata {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(nullable = false)
    private String fileName;

    @Column(nullable = false)
    private String contentType;
    private String fileSize;
    private String totalPages;
    private String totalChunks;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DocumentStatus status;

    @Column(length = 100)
    private String errorMessage;

    @Column(nullable = false, updatable = false)
//    @CreationTimestamp
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
