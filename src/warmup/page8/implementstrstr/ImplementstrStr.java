package warmup.page8.implementstrstr;

/**
 * @author Peixiao Zhao
 * @date 2020/9/8
 */
class Solution {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0){
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i ++){
            int j = 0;
            while (haystack.charAt(i + j) == needle.charAt(j)){
                j ++;
                if (j == needle.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}
