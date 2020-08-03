package page2.uniqueemailaddresses;

import java.util.HashSet;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> h = new HashSet<>();
        for (String email : emails) {
            int split = email.indexOf('@');
            String local = email.substring(0, split);
            String domain = email.substring(split);
            if (email.contains("+")) {
                int splitPlus = local.indexOf('+');
                local = local.substring(0, splitPlus);
            }
            local = local.replaceAll("\\.", "");
            h.add(local + domain);
        }
        return h.size();
    }
}
