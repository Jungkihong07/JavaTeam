package com.example.javateam.domain;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDateTime;

@Entity
@Table(name = "template")
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TemplateDao extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long template_id;

    private String title; // 템플릿 제목

    private String gcs_path;

    private String file_type;

    private String description;

    private String source;

    // ManytoOne 연관관계 제정






}
