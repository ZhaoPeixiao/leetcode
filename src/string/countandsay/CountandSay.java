package string.countandsay;

/**
 * @author Peixiao Zhao
 * @date 2020/9/27 13:08
 */
class Solution {
    public String countAndSay(int n) {
        String init = "1";
        for (int i = 1; i < n; i ++){
            init = countAndSay(init);
        }

        return init;
    }

    public String countAndSay(String strint){
        char[] str = strint.toCharArray();

        StringBuilder stringBuilder = new StringBuilder();


        int count = 1;
        char last = str[0];

        for (int p = 1; p < str.length; p ++){
            if (str[p] == last){
                count ++;
            }else{
                stringBuilder.append(count).append(last);
                count = 1;
                last = str[p];
            }
        }

        stringBuilder.append(count).append(last);

        return stringBuilder.toString();
    }
}
