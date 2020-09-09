package page8.heaters;

import java.util.Arrays;

/**
 * @author Peixiao Zhao
 * @date 2020/9/9
 */
class Solution {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(heaters);
        Arrays.sort(houses);
        int left = 0, right = Integer.MAX_VALUE;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (check(houses, heaters, mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    public boolean check(int[] houses, int[] heaters, int range){
        int i = 0, j = 0;
        while (i < houses.length && j < heaters.length){
            if (Math.abs(houses[i] - heaters[j]) > range) {
                j ++;
            }
            else{
                i ++;
            }
        }
        return i == houses.length;
    }
}
