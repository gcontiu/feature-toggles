package com.endava.hello.service;

/**
 * The class we need to swithc to
 */
public class SeasideVacation implements Vacation {

    @Override
    public String getVacationMessage() {
        return "We're going surfing ! bang";
    }

    @Override
    public int getVacationPrice() {
        return 75;
    }
}
