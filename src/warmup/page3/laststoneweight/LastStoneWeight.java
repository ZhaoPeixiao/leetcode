package warmup.page3.laststoneweight;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int n : stones){
            queue.add(n);
        }

        while (queue.size() > 1){
            int tmp1 = queue.poll();
            int tmp2 = queue.poll();

            queue.add(Math.abs(tmp1 - tmp2));

        }

        return queue.size() == 0 ? 0 : queue.poll();
    }
}
