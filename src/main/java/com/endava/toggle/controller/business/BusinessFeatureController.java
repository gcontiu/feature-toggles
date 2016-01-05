package com.endava.toggle.controller.business;

import com.endava.toggle.service.business.ABViewProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Uses a service to randomly obtain one of the two available views.
 */
@Controller
public class BusinessFeatureController {

    @Autowired
    ABViewProviderService viewProviderService;

    @RequestMapping(value = "/business", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView businessController() {

        String view = viewProviderService.provideView();

        ModelAndView mv = new ModelAndView(view);
        mv.addObject("sampleACount", viewProviderService.sampleACount);
        mv.addObject("sampleBCount", viewProviderService.sampleBCount);


        return mv;
    }
}
