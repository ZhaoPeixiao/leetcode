package warmup.page1.generateastringwithcharactersthathaveoddcounts;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String generateTheString(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        if (n % 2 == 0) {
            stringBuilder.append("a".repeat(n - 1));
            stringBuilder.append('b');
        }
        else{
            stringBuilder.append("a".repeat(n));
        }
        return stringBuilder.toString();
    }
}
