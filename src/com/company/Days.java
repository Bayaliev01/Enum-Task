package com.company;

public enum Days {
    MONDAY("java - Технический урок"),
    TUESDAY("java - Практика"),
    WEDNESDAY("java - Технический урок"),
    THURSDAY("SoftSkills - 2-жумда 1 жолу \n java - Практика"),
    FRIDAY("java - Технический урок"),
    SATURDAY("java - Практика онлайн"),
    SUNDAY("Дем алыш оз алдынча уйдон практика жасоо");
    String lessons;


    @Override
    public String toString() {
        return "Days{" +
                "lessons='" + lessons +
                super.toString();
    }

    Days(String lessons ) {
        this.lessons = lessons;

    }
}
