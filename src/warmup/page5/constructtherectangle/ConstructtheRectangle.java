package warmup.page5.constructtherectangle;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] constructRectangle(int area) {
        int[] res = new int[2];
        res[0] = area;
        res[1] = 1;

        if (area == 0) {
            return new int[0];
        }
        else if (Math.sqrt(area) % 1 == 0){
            res[0] = (int) Math.sqrt(area);
            res[1] = res[0];
            return res;
        }
        else{
            for (int i = 2; (area / i - i > 0); i ++){
                if (area % i == 0 && ((area/i - i) < (res[0] - res[1]))){
                    res[0] = area / i;
                    res[1] = i;
                }
            }
        }
        return res;
    }
}
