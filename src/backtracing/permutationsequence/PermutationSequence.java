package backtracing.permutationsequence;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/7 11:01
 */
class Solution {
    public String getPermutation(int n, int k) {
        if (n <= 0 || k <= 0){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        List<Integer> list = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i <= n; i ++){
            list.add(i);
            fact *= i;
        }

        k --;

        for (int i = 0; i < n; i ++){
            fact /= (n - i);
            int index = k / fact;
            sb.append(list.get(index));
            list.remove(index);
            k %= fact;
        }

        return sb.toString();
    }
}
