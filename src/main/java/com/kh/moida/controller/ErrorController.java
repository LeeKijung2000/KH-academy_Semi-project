package com.kh.moida.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ErrorController {
    @GetMapping("/error/401")
    public String error401() {
        return "error/401";
    }

    @GetMapping("/error/403")
    public String error403() {
        return "error/403";
    }

    @GetMapping("/error/500")
    public String error500() {
        return "error/error";
    }
}
