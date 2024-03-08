package com.example.javateam.controller;

import com.example.javateam.dto.ReplyDto;
import com.example.javateam.dto.TemplateDto;
import com.example.javateam.service.reply.ReplyService;
import com.example.javateam.service.template.TemplateService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
@RequestMapping("/read")
@Log4j2
@RequiredArgsConstructor
public class TemplateInfoController {

    private final TemplateService templateservice;
    private final ReplyService replyService;

    @GetMapping("/{tno}")
    public String read(@PathVariable("tno") Long tno, Model model) {

        log.info("-----------list------------");
        log.info("tno:  " + tno);

        model.addAttribute("item", templateservice.read(tno))
                .addAttribute("replyDtoList", replyService.getListOfTemplate(tno));


        return "TemplateInformation";

    }


}
