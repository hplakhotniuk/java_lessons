package com.company;
import java.util.Scanner;

enum Season {
    WINTER, SPRING, SUMMER, AUTUMN
}
public class Main {
    public static void main(String[] args) {
        Season season;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type name of month");
        String month;
        month = scanner.next();
        switch (month) {
            case "December":
            case "January":
            case "February":
                season = Season.WINTER;
                System.out.println(season);
                break;
            case "March":
            case "April":
            case "May":
                season = Season.SPRING;
                System.out.println(season);
                break;
            case "June":
            case "July":
            case "August":
                season = Season.SUMMER;
                System.out.println(season);
                break;
            case "September":
            case "October":
            case "November":
                season = Season.AUTUMN;
                System.out.println(season);
                break;
            default:
                System.out.println("No this month");
        }
    }
}
