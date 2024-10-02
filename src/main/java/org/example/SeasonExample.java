package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeasonExample {
    public enum Season {WINTER, SPRING, SUMMER, AUTUMN}

    public static Season seasonCheck(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter month (for ex.: December/May/July)");
        String month;

        try {
            month = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException("Error reading input", e);
        }

        switch (month) {
            case "December":
            case "January":
            case "February":
                System.out.println("Winter season");
                return Season.WINTER;
            case "March":
            case "April":
            case "May":
                System.out.println("Spring season");
                return Season.SPRING;
            case "June":
            case "July":
            case "August":
                System.out.println("Summer season");
                return Season.SUMMER;
            case "September":
            case "October":
            case "November":
                System.out.println("Autumn season");
                return Season.AUTUMN;
            default:
                System.out.println("No this month");
                return null;
        }
    }

    public static void main(String[] args) {
        Season season = seasonCheck();
        if (season != null) {
            System.out.println("Detected season: " + season);
        }
    }
}
