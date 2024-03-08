package com.example.javateam.repository;

import com.example.javateam.domain.ReplyDao;
import com.example.javateam.domain.TemplateDao;
import com.example.javateam.domain.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class ReplyRepoTests {

    @Autowired
    private ReplyRepo replyRepo;

//    @Test
//    public void insertTemplateReply() {
//
//        // 20개의 댓글 등록
//        IntStream.rangeClosed(1, 20).forEach( i -> {
//
//            // 템플릿 번호
//            Long tno = (long)(Math.random()*10) + 1;
//
//            // 리뷰 등록 회원 번호
//            Long id = ((long)(Math.random()*10)+1);
//            UserDao userDao = UserDao.builder().id(id).build();
//
//            ReplyDao replyDao = ReplyDao.builder()
//                    .user(userDao)
//                    .template(TemplateDao.builder().template_id(tno).build())
//                    .grade((int)(Math.random()*5) + 1)
//                    .text("이 템플릿에 대한 소감 .  .  ." + i)
//                    .build();
//
//            replyRepo.save(replyDao);
//
//        });
//    }

    @Test
    public void testGetTemplateReplys() {

        TemplateDao templateDao = TemplateDao.builder().template_id(4L).build();

        List<ReplyDao> result = replyRepo.findByTemplate(templateDao);

        result.forEach(templateReply -> {
            System.out.print(templateReply.getReply_id());
            System.out.print("\t" + templateReply.getUser().getNickname());
            System.out.print("\t" + templateReply.getGrade());
            System.out.print("\t" + templateReply.getText());
            System.out.print("\t" + templateReply.getUser().getEmail());
            System.out.println("----------------------------");
        });
    }
}
