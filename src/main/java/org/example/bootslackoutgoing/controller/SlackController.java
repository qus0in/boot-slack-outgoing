package org.example.bootslackoutgoing.controller;

import org.example.bootslackoutgoing.dto.SlackAnswerDTO;
import org.example.bootslackoutgoing.dto.SlackWebhookDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlackController {
    @PostMapping
    // Form
    public ResponseEntity<SlackAnswerDTO> post(@ModelAttribute SlackWebhookDTO dto) {
        if (dto.user_name().equals("slackbot")) {
//            throw new RuntimeException("자문자답 금지");
            return ResponseEntity.ok(new SlackAnswerDTO(""));
        }
//        System.out.println(dto);

        String answer = "<@%s> %s에 대한 대답입니다".formatted(dto.user_id(), dto.text());

        return ResponseEntity.ok(new SlackAnswerDTO(answer));
    }
}
