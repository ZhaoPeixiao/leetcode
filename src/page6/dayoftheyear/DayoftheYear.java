package page6.dayoftheyear;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int dayOfYear(String date) {
        int month = Integer.parseInt(date.substring(5, 7));
        int year = Integer.parseInt(date.substring(0, 4));
        int result = Integer.parseInt(date.substring(8));

        boolean isLeapYear = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);

        for (int i = 1; i < month; i ++){
            if (i == 2) {
                result += isLeapYear ? 29 : 28;
            }
            else{
                result += (i > 7) ^ (i % 2 == 0) ? 30 : 31;
            }
        }
        return result;
    }
}
