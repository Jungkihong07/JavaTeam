package com.example.javateam.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReplyDto {

    // 댓글 번호
    private Long replynum;

    // 템플릿 번호
    private Long tno;

    // 회원 id
    private Long user_id;

    private String nickname;

    private int grade;

    private String text;

    private LocalDateTime regDate, modDate;
}
