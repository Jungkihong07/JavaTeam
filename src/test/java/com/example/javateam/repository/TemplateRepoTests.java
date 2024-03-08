package com.example.javateam.repository;

import com.example.javateam.domain.TemplateDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

@SpringBootTest
public class TemplateRepoTests {

    @Autowired
    TemplateRepo templateRepository;

//    @Test
//    public void testClass() {
//        System.out.println(templateRepository.getClass().getName());
//        // 프록시 객체 생성 및 클래스 이름 출력
//    }

//    @Test
//    public void testInsertDummies() {
//        IntStream.rangeClosed(1, 10).forEach( i-> {
//            TemplateDao templatedao = TemplateDao.builder()
//                    .title("Sample........" + i)
//                    .description("Template Description......" + i)
//                    .gcs_path("http://gcs/image" + i)
//                    .file_type("pdf")
//                    .build();
//
//            templateRepository.save(templatedao);
//        });
//    }

    // 특정 템플릿의 모든 평균 별점/댓글 개수 조회
    @Test
    public void testGetTemplateWithAll() {

        List<Object[]> result = templateRepository.getTemplateWithAll(4L);

        System.out.println(result);

        for(Object[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
    }

 }
