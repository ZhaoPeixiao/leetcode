package warmup.page8.lengthoflastword;

/**
 * @author Peixiao Zhao
 * @date 2020/9/9
 */
class Solution {
    public int lengthOfLastWord(String s) {
        String str[] = s.split(" ");
        if(str.length == 0){
            return 0;
        }
        return (str[str.length-1]).length();
    }
}