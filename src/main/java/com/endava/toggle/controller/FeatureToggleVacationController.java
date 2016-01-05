package com.endava.toggle.controller;

import com.endava.toggle.service.Vacation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by anghelc on 05/01/16.
 */
@Controller
public class FeatureToggleVacationController {

    private final static Logger LOGGER = LoggerFactory.getLogger(FeatureToggleVacationController.class);

    /**
     * Initially spring did the wiring of the only type of vacation instance that existed
     * (i.e. MountainVacation instance)
     */
    @Autowired
    private Vacation vacation;

    /**
     * This method remained unchanged as the toggling logic was added with
     *
     * {@link com.endava.toggle.application.AppConfig} and
     * {@link com.endava.toggle.service.VacationType}.
     *
     * None of them existed before.
     */
    @RequestMapping(value = "/vacation", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView vacation() {

        String vacationMessage = vacation.getVacationMessage();
        int vacationPrice = vacation.getVacationPrice();

        return new ModelAndView("vacation")
                .addObject("vacationMessage",vacationMessage)
                .addObject("vacationPrice", vacationPrice);

    }

}
