package warmup.page8.xofakindinadeckofcards;

import java.util.HashMap;

/**
 * @author Peixiao Zhao
 * @date 2020/9/8
 */
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : deck){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        int lowest = Integer.MAX_VALUE;
        for (int i : map.keySet()){
            lowest = Math.min(lowest, map.get(i));
        }
        for (int i = lowest; i >= 2; i --){
            boolean flag = true;
            for (int j : map.keySet()){
                if (map.get(j) % i != 0) {
                    flag = false;
                }
            }
            if (flag){
                return true;
            }
        }
        return false;
    }
}
