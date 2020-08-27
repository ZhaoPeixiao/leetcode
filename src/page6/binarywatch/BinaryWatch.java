package page6.binarywatch;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < 12; i ++){
            for (int j = 0; j < 60; j ++){
                if (Integer.bitCount(i) + Integer.bitCount(j) == num){
                    if (j == 0 && i != 0) {
                        res.add(i + ":00");
                    }
                    else{
                        if (i == 0 && j == 0){
                            res.add("0:00");
                        } else if (j < 10) {
                            res.add(i + ":0" + j);
                        }else{
                            res.add(i+ ":" + j);
                        }
                    }
                }
            }
        }
        return res;
    }
}
