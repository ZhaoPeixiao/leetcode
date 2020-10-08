package backtracing.permutationsii;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Peixiao Zhao
 * @date 2020/10/8 19:02
 */
class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        ArrayList<List<Integer>> found = new ArrayList<List<Integer>>();
        found.add(asList(nums));
        while (nextPermutation(nums)) {
            found.add(asList(nums));
        }
        return found;
    }


    public void swap(int x[], int a, int b) {
        int t = x[a];
        x[a] = x[b];
        x[b] = t;
    }

    public boolean nextPermutation(int[] num){
        if (num.length < 2){
            return false;
        }
        int p = -1;

        for (int i = num.length - 1; i > 0; i --){
            if (num[i] > num[i - 1]){
                p = i - 1;
                break;
            }
        }

        if (p == -1){
            Arrays.sort(num);
            return false;
        }

        int c = -1;
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] > num[p]) {
                c = i;
                break;
            }
        }
        swap(num, p, c);
        Arrays.sort(num, p + 1, num.length);
        return true;
    }

    public List<Integer> asList(int[] num) {
        ArrayList<Integer> l = new ArrayList<Integer>(num.length);
        for (int i = 0; i < num.length; i++)
            l.add(num[i]);
        return l;
    }
}
