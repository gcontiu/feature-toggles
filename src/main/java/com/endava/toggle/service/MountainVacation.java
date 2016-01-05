package com.endava.toggle.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * First implementation of Vacation interface.
 */
@Service
public class MountainVacation implements Vacation{

    private final static Logger LOGGER = LoggerFactory.getLogger(MountainVacation.class);

    @Override
    public String getVacationMessage() {
        String message = "We're going skying ! yey ";
        LOGGER.info(message);
        return message;
    }

    @Override
    public int getVacationPrice() {
        return 100;
    }
}
