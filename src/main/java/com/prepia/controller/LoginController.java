package com.prepia.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor

public class LoginController {

    @GetMapping("/")
    public String showLoginPage(@Validated Model model) {
        log.info("Login page requested");
        // 필요한 경우 데이터를 모델에 추가
        model.addAttribute("title", "Login Page");
        return "html/login/login"; // resources/templates/login.html
    }

}
