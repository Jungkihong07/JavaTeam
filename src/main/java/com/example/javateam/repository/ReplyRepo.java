package com.example.javateam.repository;

import com.example.javateam.domain.ReplyDao;
import com.example.javateam.domain.TemplateDao;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReplyRepo extends JpaRepository<ReplyDao, Long> {

    // 특정 템플릿의 모든 댓글과 회원 닉네임 조회
    @EntityGraph(attributePaths = {"user"}, type=EntityGraph.EntityGraphType.FETCH)
    List<ReplyDao> findByTemplate(TemplateDao templateDao);

}
