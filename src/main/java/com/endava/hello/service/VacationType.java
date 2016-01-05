package com.endava.hello.service;

/**
 * Builds the vacation instance.
 */
public enum VacationType {

    SUMMER() {
        @Override
        public Vacation getVacation() {
            return new SeasideVacation();
        }
    },
    WINTER () {
        @Override
        public Vacation getVacation() {
            return new MountainVacation();
        }
    };

    public abstract Vacation getVacation();


}
