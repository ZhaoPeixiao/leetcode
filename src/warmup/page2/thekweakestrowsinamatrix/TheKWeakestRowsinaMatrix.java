package warmup.page2.thekweakestrowsinamatrix;

import java.util.PriorityQueue;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(
                (a,b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        for (int i=0;i<mat.length;i++) {
            int firstZero = BS(mat[i]);
            pq.add(new int[] {i, firstZero});
        }
        int[] res = new int[k];
        int idx = 0;
        while (idx < k) {
            res[idx++] = pq.poll()[0];
        }
        return res;
    }

    public int BS(int[] row) {
        // looking for first zero;
        int i = 0;
        int j = row.length-1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (mid == 0) {
                if (row[mid] == 0) return mid;
                else i = mid + 1;
            }
            else {
                if (row[mid] == 0)  {
                    if (row[mid-1] == 1) {
                        return mid;
                    }
                    else {
                        j = mid - 1;
                    }
                }
                else {
                    i = mid + 1;
                }
            }
        }
        return row.length;
    }
}
