package array.jumpgameiii;

import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/9/16 20:30
 */
class Solution {
    public boolean canReach(int[] arr, int start) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        boolean[] seen = new boolean[arr.length];
        seen[start] = true;
        while (!stack.isEmpty()){
            int curr = stack.pop();
            int left = curr - arr[curr];
            int right = curr + arr[curr];
            if (arr[curr] == 0){
                return true;
            }
            if (left >= 0 && !seen[left]){
                if (arr[left] == 0){
                    return true;
                }
                stack.push(left);
                seen[left] = true;
            }
            if (right < arr.length && !seen[right]){
                if (arr[right] == 0){
                    return true;
                }
                stack.push(right);
                seen[right] = true;
            }
        }
        return false;
    }
}
