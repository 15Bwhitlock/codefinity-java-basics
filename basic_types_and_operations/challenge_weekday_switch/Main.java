package com.example;

public class Main {

    public static void printDayMessage(int day) {
        switch (day) {
            case 1:
                System.out.println("Day of the week: " + "monday");
                break;
            case 2:
                System.out.println("Day of the week: " + "tuesday");
                break;
            case 3:
                System.out.println("Day of the week: " + "wednesday");
                break;
            case 4:
                System.out.println("Day of the week: " + "thursday");
                break;
            case 5:
                System.out.println("Day of the week: " + "friday");
                break;
            case 6:
                System.out.println("Day of the week: " + "saturday");
                break;
            case 7:
                System.out.println("Day of the week: " + "sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void main(String[] args) {
        int day = 4;
        printDayMessage(day);
    }
}