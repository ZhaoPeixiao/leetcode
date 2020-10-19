package bfs.coursescheduleii;

import java.util.LinkedList;

/**
 * @author Peixiao Zhao
 * @date 2020/10/19 16:48
 */
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        if (prerequisites == null) {
            throw new IllegalArgumentException();
        }

        int len = prerequisites.length;
        if (len == 0){
            int[] res = new int[numCourses];
            for (int i = 0; i < res.length; i ++){
                res[i] = i;
            }
            return res;
        }

        int[] res = new int[numCourses];
        int c = 0;

        int[] pCounter = new int[numCourses];
        for (int i = 0; i < len; i ++){
            pCounter[prerequisites[i][0]] ++;
        }

        LinkedList<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i ++){
            if (pCounter[i] == 0) {
                queue.add(i);
            }
        }

        int numNoPre = queue.size();
        while (!queue.isEmpty()) {
            int top = queue.remove();
            res[c++] = top;
            for (int i = 0; i < len; i ++){
                if (prerequisites[i][1] == top) {
                    pCounter[prerequisites[i][0]] --;
                    if (pCounter[prerequisites[i][0]] == 0){
                        numNoPre ++;
                        queue.add(prerequisites[i][0]);
                    }
                }
            }
        }

        if (numNoPre != numCourses) {
            return new int[] {};
        }

        return res;
    }
}
