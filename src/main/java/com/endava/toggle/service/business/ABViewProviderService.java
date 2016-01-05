package com.endava.toggle.service.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Will provide a view or another based on a random number and a threshold.
 * There are 75% chances that "sample A" view will be generated.
 */
@Service
public class ABViewProviderService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ABViewProviderService.class);

    private static final String SAMPLE_A = "samplePageA";
    private static final String SAMPLE_B = "samplePageB";

    private static final int THRESHOLD = 3;

    public int sampleACount;
    public int sampleBCount;

    private Random randomGenerator = new Random();


    public String provideView() {

        int randomInt = randomGenerator.nextInt(4);

        if (randomInt < THRESHOLD) {
            sampleACount++;
            logStatus(randomInt);

            return SAMPLE_A;

        } else {
            sampleBCount++;
            logStatus(randomInt);

            return SAMPLE_B;
        }
    }

    /**
     * Logs information on the random number and on how many times each view was generated.
     */
    private void logStatus(int randomInt) {
        LOGGER.info("Generated random no. " + randomInt + "; count SampleA = " + sampleACount + "; count SampleB = " + sampleBCount);
    }
}
