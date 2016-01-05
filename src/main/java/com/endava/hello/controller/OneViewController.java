package com.endava.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Release toggle: Change View name from properties file
 - have a properties value that determines to display helloA or helloB
 */
@Controller
public class OneViewController {

    private final static Logger LOGGER = LoggerFactory.getLogger(OneViewController.class);

    @Value("${view.name}")
    private String viewName;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    ModelAndView home() {
        LOGGER.info("view name = " + viewName);

        return new ModelAndView(viewName)
                .addObject("name", "My dear controller");
    }


}
