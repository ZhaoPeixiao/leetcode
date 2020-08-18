package page4.twosumiiinputarrayissorted;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1 = 0, index2 = numbers.length - 1;
        while (numbers[index1] + numbers[index2] != target){
            if (numbers[index1] + numbers[index2] > target){
                index2 --;
            }
            else{
                index1 ++;
            }
        }

        return new int[]{index1 + 1, index2 + 1};
    }
}
