package page7.powerfulintegers;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        int m = Math.max(x,y);
        int n = Math.min(x,y);
        HashSet<Integer> st = new HashSet<Integer>();
        int CurrI = 0;
        int CurrJ = 0;
        while( (Math.pow(m,CurrI)+Math.pow(n,CurrJ)) <= bound)
        {
            while( (Math.pow(m,CurrI)+Math.pow(n,CurrJ)) <= bound)
            {
                st.add( (int) (Math.pow(m,CurrI)+Math.pow(n,CurrJ)) );
                CurrJ++;
                if (n == 1) break;
            }
            CurrJ = 0;
            CurrI++;
            if (m == 1) break;
        }
        List<Integer> result = new ArrayList<Integer>();
        for (int val : st)
        {
            result.add((int)val);
        }
        return result;
    }
}
