package warmup.page5.pascalstriangleii;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> prev = new ArrayList<>();
        prev.add(1);

        if (rowIndex == 0) {
            return prev;
        }

        for (int i = 1; i <= rowIndex; i ++){
            List<Integer> list = new ArrayList<>();
            list.add(1);

            for (int j = 1; j < i; j ++){
                list.add(prev.get(j - 1) + prev.get(j));
            }

            list.add(1);

            prev = list;
        }

        return prev;
    }
}
