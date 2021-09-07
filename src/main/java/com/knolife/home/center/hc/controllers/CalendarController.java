package com.knolife.home.center.hc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CalendarController {
    @RequestMapping("/calendar")
    String calendar(){
        return "calendar";
    }
}
