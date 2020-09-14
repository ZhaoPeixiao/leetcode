package warmup.page3.findluckyintegerinanarray;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int findLucky(int[] arr) {
        int[] count = new int[500];
        for (int n : arr){
            count[n] ++;
        }
        for (int i = 499; i >= 0; i --){
            if (count[i] != 0) {
                if (i == count[i]){
                    return i + 1;
                }
            }

        }
        return -1;
    }
}

//class Solution {
//    public int findLucky(int[] arr) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : arr){
//            if (!map.containsKey(i)) {
//                map.put(i, 1);
//            }
//            else{
//                int old = map.get(i);
//                map.put(i, old + 1);
//            }
//        }
//        int res = -1;
//        for (Integer key : map.keySet()){
//            if (key.equals(map.get(key))){
//                res = Math.max(res, key);
//            }
//        }
//        return res;
//    }
//}
