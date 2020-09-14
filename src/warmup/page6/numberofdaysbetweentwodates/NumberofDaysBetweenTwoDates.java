package warmup.page6.numberofdaysbetweentwodates;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(dayCount(date1) - dayCount(date2));
    }

    int[] mo = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private int dayCount(String date) {
        String[] ss = date.split("-");
        int year = Integer.parseInt(ss[0]);
        int month = Integer.parseInt(ss[1]);
        int day = Integer.parseInt(ss[2]);
        int count = day;
        for (int i = 1; i < month; ++i) {
            if (i == 2 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)))
                count += mo[i] + 1;
            else count += mo[i];
        }
        for (int i = 1970; i < year; ++i) {
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) count += 366;
            else count += 365;
        }
        return count;
    }
}
