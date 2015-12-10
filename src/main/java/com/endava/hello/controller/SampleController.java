package com.endava.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.Map;

@Controller
public class SampleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView home() {
        return new ModelAndView("hello")
                .addObject("name", "My dear controller");
    }


}
