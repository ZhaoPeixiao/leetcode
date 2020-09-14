package warmup.page8.canplaceflowers;

/**
 * @author Peixiao Zhao
 * @date 2020/9/10
 */
class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int totalCount = 0;
        int currentCount = 1;
        for (int i = 0; i < flowerbed.length; i ++){
            if (flowerbed[i] == 0) {
                currentCount ++;
            }else{
                totalCount += (currentCount-1) / 2;
                currentCount = 0;
            }
        }
        if (currentCount != 0){
            totalCount += (currentCount / 2);
        }
        return totalCount >= n;
    }
}
