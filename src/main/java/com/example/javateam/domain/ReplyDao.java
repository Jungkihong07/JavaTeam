package com.example.javateam.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString(exclude = {"user", "template"})
@Table(
        name = "reply"
)
public class ReplyDao extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long reply_id;

    private int grade;

    private String text;

    // @ManyToOne 연관관계 지정
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserDao user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "template_id")
    private TemplateDao template;

    // +댓글 수정 기능 추가 필요

}
