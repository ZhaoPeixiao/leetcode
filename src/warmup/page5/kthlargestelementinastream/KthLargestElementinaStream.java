package warmup.page5.kthlargestelementinastream;

import java.util.PriorityQueue;

/**
 * @Author: Peixiao Zhao
 */
class KthLargest {
    int K;
    PriorityQueue<Integer> q = new PriorityQueue<>();
    public KthLargest(int k, int[] nums) {
        K = k;
        for(int a: nums){
            add(a);
        }

    }

    public int add(int val) {
        q.add(val);
        if(q.size() > K){
            q.poll();
        }
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
