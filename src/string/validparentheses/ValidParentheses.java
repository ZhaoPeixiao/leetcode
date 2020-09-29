package string.validparentheses;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author Peixiao Zhao
 * @date 2020/9/29 18:08
 */
class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() % 2 == 1) {
            return false;
        }

        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i ++){
            char c = s.charAt(i);
            if (map.containsKey(c)){
                stack.push(c);
            } else if (map.containsValue(c)) {
                if (!stack.empty() && map.get(stack.peek()) == c){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
