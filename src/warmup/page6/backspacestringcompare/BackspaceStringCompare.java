package warmup.page6.backspacestringcompare;

import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        int max = Math.max(S.length(), T.length());

        for (int i = 0; i < max; i ++){
            if (i < S.length()) {
                if (S.charAt(i) == '#' && !s1.isEmpty()) {
                    s1.pop();
                } else if (S.charAt(i) != '#') {
                    s1.push(S.charAt(i));
                }
            }

            if (i < T.length()) {
                if (T.charAt(i) == '#' && !s2.isEmpty()) {
                    s2.pop();
                } else if (T.charAt(i) != '#') {
                    s2.push(T.charAt(i));
                }
            }
        }

        return s1.equals(s2);
    }
}
