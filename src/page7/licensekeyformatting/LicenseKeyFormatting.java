package page7.licensekeyformatting;

import java.util.Stack;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String licenseKeyFormatting(String S, int K) {
        Stack<Character> stack = new Stack<>();

        for (char c : S.toCharArray()){
            if (c != '-') {
                stack.push(Character.toUpperCase(c));
            }
        }
        StringBuilder stringBuilder = new StringBuilder();

        while (!stack.isEmpty()) {
            int count = 0;
            while (count < K){
                if (!stack.isEmpty()) {
                    stringBuilder.append(stack.pop());
                    count ++;
                }
                else {
                    break;
                }
            }
            stringBuilder.append("-");
        }
        stringBuilder = stringBuilder.reverse();
        if (stringBuilder.length() > 0 && stringBuilder.charAt(0) == '-'){
            stringBuilder.deleteCharAt(0);
        }
        return stringBuilder.toString();
    }
}
