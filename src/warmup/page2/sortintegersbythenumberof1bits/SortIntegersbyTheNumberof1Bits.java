package warmup.page2.sortintegersbythenumberof1bits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int[] sortByBits(int[] arr) {
        List<Integer> array = IntStream.of(arr).boxed().collect(Collectors.toCollection(ArrayList::new));

        Collections.sort(array, (a, b) -> {
            if (countSetBits(a) == countSetBits(b)) {
                return a - b;
            }
            return countSetBits(a) - countSetBits(b);
        });

        return array.stream().mapToInt(x -> x).toArray();
    }

    private static int countSetBits(int n) {
        int count = 0;
        for (int i = 0; i < 31; i++) {
            count += n >> i & 1;
        }
        return count;
    }
}
