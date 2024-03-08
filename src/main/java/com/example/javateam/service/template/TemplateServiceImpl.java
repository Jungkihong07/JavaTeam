package com.example.javateam.service.template;

import com.example.javateam.domain.TemplateDao;
import com.example.javateam.dto.TemplateDto;
import com.example.javateam.repository.TemplateRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
@RequiredArgsConstructor
public class TemplateServiceImpl  implements  TemplateService{

    private final TemplateRepo templateRepo;


//    @Override
//    public Long register(TemplateDto dto) {
//
//        log.info("DTO------------------------");
//        log.info(dto);
//
//        TemplateDao entity = dtoToEntity(dto); // 변환
//
//        log.info(entity);
//
//        repo.save(entity);
//
//        return entity.getTemplate_id();
//
//    }

    // 템플릿 조회
    @Override
    public TemplateDto read(Long tno) {

        Optional<TemplateDao> result = templateRepo.findById(tno);

        return result.isPresent() ? entityToDto(result.get()): null;
    }

}
