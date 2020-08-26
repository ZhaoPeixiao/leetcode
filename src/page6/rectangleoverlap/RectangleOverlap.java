package page6.rectangleoverlap;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    static final int X1 = 0, X2 = 2, Y1 = 1, Y2 = 3;

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return  rec1[X2] > rec2[X1] && rec1[X1] < rec2[X2] &&
                rec1[Y2] > rec2[Y1] && rec1[Y1] < rec2[Y2] ;
    }
}
