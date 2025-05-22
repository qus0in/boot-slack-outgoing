package org.example.bootslackoutgoing.controller;

import org.example.bootslackoutgoing.dto.SlackWebhookDTO;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SlackController {
    @PostMapping
    // Form
    public void post(@ModelAttribute SlackWebhookDTO dto) {
        System.out.println(dto);
    }
}
