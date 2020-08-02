package page2.buildanarraywithstackoperations;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<String> buildArray(int[] target, int n) {
        int index=0;

        List<String> li = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if(index < target.length){
                li.add("Push");
            }else
                break;
            if(i == target[index])
                index++;
            else
                li.add("Pop");
        }
        return li;
    }
}
