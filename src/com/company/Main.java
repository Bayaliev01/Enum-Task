package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {


        Days days = Days.valueOf(scanner.next().toUpperCase());
        if (days.equals(Days.MONDAY) ){
            System.out.println(Days.MONDAY.lessons);
        } else if (days.equals(Days.TUESDAY)) {
            System.out.println(Days.TUESDAY.lessons);
        } else if (days.equals(Days.WEDNESDAY)) {
            System.out.println(Days.WEDNESDAY.lessons);
        } else if (days.equals(Days.THURSDAY)) {
            System.out.println(Days.THURSDAY.lessons);
        } else if (days.equals(Days.FRIDAY)) {
            System.out.println(Days.FRIDAY.lessons);
        } else if (days.equals(Days.SATURDAY)) {
            System.out.println(Days.SATURDAY.lessons);
        } else if (days.equals(Days.SUNDAY)) {
            System.out.println(Days.SUNDAY.lessons);
        }
    }catch (Exception e){
            System.out.println("Нет таких дней");
        }
    }
}