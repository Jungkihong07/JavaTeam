package com.example.javateam.service.reply;

import com.example.javateam.domain.ReplyDao;
import com.example.javateam.domain.TemplateDao;
import com.example.javateam.dto.ReplyDto;
import com.example.javateam.repository.ReplyRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{

    private final ReplyRepo replyRepo;

    @Override
    public List<ReplyDto> getListOfTemplate(Long tno) {

        TemplateDao templateDao = TemplateDao.builder().template_id(tno).build();

        List<ReplyDao> result = replyRepo.findByTemplate(templateDao);

        return result.stream().map(replyDao ->
                entityToDto(replyDao)).collect(Collectors.toList());

    }

}
