package warmup.page3.goatlatin;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String toGoatLatin(String S) {
        List<String> res = new ArrayList<>();
        int countOfA = 1;
        String suffix = "ma";
        Set<Character> vowels = new HashSet<>();
        vowels.addAll(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (String s : S.split(" ")) {
            StringBuilder sb = new StringBuilder();
            char ch = s.charAt(0);

            if (vowels.contains(Character.toLowerCase(ch))) {
                sb.append(s).append(suffix);
            } else {
                sb.append(s.substring(1)).append(ch).append(suffix);
            }

            for (int i = 0; i < countOfA; i++) {
                sb.append('a');
            }

            res.add(sb.toString());
            countOfA++;
        }

        return res.stream().collect(Collectors.joining(" "));
    }
}
