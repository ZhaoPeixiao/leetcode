package page3.dayoftheweek;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        int days = day;
        int startYear = 1970;

        while (startYear < year) {
            days += 365;

            if (isLeapYear(startYear)) {
                days++;
            }

            startYear++;
        }

        int[] months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int startMonth = 1;

        while (startMonth < month) {
            days += months[startMonth++];
        }

        if (isLeapYear(year) && month > 2) {
            days++;
        }

        String[] weekDays = {"Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Tuesday"};
        return weekDays[days % 7];
    }

    public boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}