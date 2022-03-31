package com.company;

public class NextDayCalculator {
    public static int[] nextDay(int[] date) {
        if (date.length != 3) {
            return null;
        }
        int day = date[0];
        int month = date[1];
        int year = date[2];
        day += 1;

        if (day > daysOfMonth(month, year)) {
            day = 1;
            month += 1;
        }

        if (month > monthOfYear(month)) {
            month = 1;
            year += 1;
        }
        return new int[]{day, month, year};
    }

    public static int daysOfMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;

        }
        return 0;
    }

    public static int monthOfYear(int month) {
        return 12;
    }

    public static boolean isLeapYear(int year) {
        boolean chiaHetCho400 = year % 400 == 0;
        boolean chiaHetCho100 = year % 100 == 0;
        boolean chiaHetCho4 = year % 4 == 0;
        if (chiaHetCho400) {
            return true;
        } else {
            if (chiaHetCho100) {
                return false;
            } else {
                if (chiaHetCho4) {
                    return true;
                }
            }
        }
        return false;
    }
}

