package com.company;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
    @Test
    public void testNextDay1() {
        int[] date = new int[]{1, 1, 2018};
        int[] expected = new int[]{2, 1, 2018};
        int[] actual = NextDayCalculator.nextDay(date);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNextDay2() {
        int[] date = new int[]{31, 1, 2018};
        int[] expected = new int[]{1, 2, 2018};
        int[] actual = NextDayCalculator.nextDay(date);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNextDay3() {
        int[] date = new int[]{30, 4, 2018};
        int[] expected = new int[]{1, 5, 2018};
        int[] actual = NextDayCalculator.nextDay(date);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNextDay4() {
        int[] date = new int[]{28, 2, 2018};
        int[] expected = new int[]{1, 3, 2018};
        int[] actual = NextDayCalculator.nextDay(date);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testNextDay5() {
        int[] date = new int[]{29, 2, 2020};
        int[] expected = new int[]{1, 3, 2020};
        int[] actual = NextDayCalculator.nextDay(date);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testNextDay6(){
        int[] date = new int[]{31, 12, 2020};
        int[] expected = new int[]{1, 1, 2021};
        int[] actual = NextDayCalculator.nextDay(date);
        assertArrayEquals(expected, actual);
    }
}