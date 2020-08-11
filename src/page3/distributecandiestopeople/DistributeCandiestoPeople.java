package page3.distributecandiestopeople;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int result[] = new int[num_people];
        int i = 0, temp = 1, sum = 0;
        for (; candies > 0; i = (i + 1) % num_people) {
            if (temp < candies) {
                result[i] = result[i] + temp;
            } else {
                result[i] = result[i] + candies;
            }
            candies = candies - temp;
            temp++;
        }
        return result;
    }
}
