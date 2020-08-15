package page4.twocityscheduling;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public void sortByColumn(int[][] arr, int col){
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[col] > o2[col]){
                    return 1;
                }
                else
                    return -1;
            }
        });
    }


    public int twoCitySchedCost(int[][] costs) {
        int[][] difference = new int[costs.length][3];
        for (int i = 0; i < costs.length; i ++){
            difference[i][0] = costs[i][0];
            difference[i][1] = costs[i][1];
            difference[i][2] = costs[i][0] - costs[i][1];
        }

        sortByColumn(difference, 2);
        int res = 0;
        for (int i = 0; i < difference.length / 2; i ++){
            res += difference[i][0];
        }

        for (int i = difference.length / 2; i < difference.length; i ++){
            res += difference[i][1];
        }

        return res;
    }
}
