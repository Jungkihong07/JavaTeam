package com.example.javateam.service.reply;

import com.example.javateam.domain.ReplyDao;
import com.example.javateam.dto.ReplyDto;

import java.util.List;

public interface ReplyService {

    // 템플릿 내 모든 댓글을 가져오기
    List<ReplyDto> getListOfTemplate(Long tno);

    default ReplyDto entityToDto(ReplyDao replyDao) {

        ReplyDto replyDto = ReplyDto.builder()
                .replynum(replyDao.getReply_id())
                .tno(replyDao.getTemplate().getTemplate_id())
                .user_id(replyDao.getUser().getId())
                .nickname(replyDao.getUser().getNickname())
                .grade(replyDao.getGrade())
                .text(replyDao.getText())
                .regDate(replyDao.getRegDate())
                .modDate(replyDao.getModDate())
                .build();

        return replyDto;

    }
}
