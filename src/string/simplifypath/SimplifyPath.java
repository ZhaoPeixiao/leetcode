package string.simplifypath;

import java.util.LinkedList;

/**
 * @author Peixiao Zhao
 * @date 2020/9/29 17:59
 */
class Solution {
    public String simplifyPath(String path) {
        if (path == null) {
            return null;
        }
        String[] names = path.split("/");
        int eat = 0;
        LinkedList<String> stack = new LinkedList<String>();
        for (int i = names.length - 1; i >= 0; i--) {
            String token = names[i];
            if (token.equals("..")) {
                eat++;
            } else if (token.equals(".")) {
                // do nothing
            } else if (token.equals("")) {
                // do nothing
            } else {
                if (eat > 0) {
                    eat--;
                } else {
                    stack.push(token);
                }
            }
        }
        StringBuilder s = new StringBuilder();
        s.append("/");
        while (stack.size() > 1) {
            s.append(stack.pop());
            s.append("/");
        }
        if (!stack.isEmpty()) {
            s.append(stack.pop());
        }
        return s.toString();
    }
}
