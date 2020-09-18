package array.pascalstriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/9/18 17:32
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        Integer[] pre = null;

        for (int i = 1; i <= numRows; i ++){
            Integer[] row = new Integer[i];
            row[0] = 1;
            row[i - 1] = 1;
            for (int j = 1; j < i - 1; j ++){
                row[j] = pre[j] + pre[j - 1];
            }
            res.add(new ArrayList<Integer>(Arrays.asList(row)));
            pre = row;
        }
        return res;
    }
}
