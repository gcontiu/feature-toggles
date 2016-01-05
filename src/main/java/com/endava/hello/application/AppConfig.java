package com.endava.hello.application;

import com.endava.hello.service.Vacation;
import com.endava.hello.service.VacationType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by anghelc on 05/01/16.
 */
@Configuration
public class AppConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppConfig.class);

    @Value("${vacation.type}")
    private String vacationType;

    @Bean
    Vacation vacation() {

        LOGGER.info("vacation type = " + vacationType);

        Vacation vacation = VacationType.valueOf(vacationType.toUpperCase()).getVacation();

        return vacation;
    }
}
