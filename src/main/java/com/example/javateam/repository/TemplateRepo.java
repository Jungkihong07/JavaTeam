package com.example.javateam.repository;

import com.example.javateam.domain.TemplateDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TemplateRepo extends JpaRepository<TemplateDao, Long> {

    // 특정 템플릿의 모든 평균 별점/댓글 개수 조회
    @Query("select t, avg(coalesce(r.grade, 0)), count(distinct r) " +
            "from TemplateDao t left outer join ReplyDao r on r.template = t " +
            "where t.template_id = :template_id")
    List<Object[]> getTemplateWithAll(Long template_id);


}
