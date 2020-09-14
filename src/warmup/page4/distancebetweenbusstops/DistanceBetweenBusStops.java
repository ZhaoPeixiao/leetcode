package warmup.page4.distancebetweenbusstops;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int total = 0, sum = 0;
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }
        for (int i = 0; i < distance.length; i ++){
            if (i >= start && i < destination){
                sum += distance[i];
            }
            total += distance[i];
        }
        return Math.min(total - sum, sum);
    }
}
