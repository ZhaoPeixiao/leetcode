package warmup.page6.flowerplantingwithnoadjacent;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {

    List<List<Integer>> l1 = new ArrayList<>();

    public int[] gardenNoAdj(int N, int[][] paths) {
        int[] res = new int[N];
        for (int i = 0; i < N; i ++){
            l1.add(new ArrayList<>());
        }
        for (int i = 0; i < paths.length; i ++){
            l1.get(paths[i][0] - 1).add(paths[i][1]);
            l1.get(paths[i][1] - 1).add(paths[i][0]);
        }

        for (int i = 0; i < N; i ++){
            int[] colors = new int[5];
            for (Integer child: l1.get(i)){
                colors[res[child - 1]] = 1;
            }
            for (int j = 1; j <=4; j ++){
                if (colors[j] == 0){
                    res[i] = j;
                    break;
                }
            }
        }
        return res;
    }
}
