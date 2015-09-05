package lesson4fundamentaldatatypes.dayoftheweek;

public class WhatDayWillItBe {
    public static void main(String[] args)
    {
        // computer the weekday: 0 - Sun, 1 - Mon, ..., 6 - Sat
        Day birthday = new Day(1989, 7, 1);
        Day referenceDay = new Day(1900, 1, 1);
        int referenceWeekDay = 1;
        int daysBetween = birthday.daysFrom(referenceDay); // 32688
        int uncorrectedWeekDay = referenceWeekDay + daysBetween; // 32689
        int weekday = uncorrectedWeekDay % 7;
        System.out.print("Weekday: ");
        System.out.println(weekday);
    }
}
