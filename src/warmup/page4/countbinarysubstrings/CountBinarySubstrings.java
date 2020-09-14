package warmup.page4.countbinarysubstrings;

/**
 * @Author: Peixiao Zhao
 */
//class Solution {
//    public int countBinarySubstrings(String s) {
//        int count = 0;
//        for (int i = 0; i < s.length() - 1; i ++){
//            for (int j = i + 2; j <= s.length(); j += 2){
//                String str = s.substring(i, j);
//                if (check(str)) {
//                    count ++;
//                }
//            }
//        }
//        return count;
//    }
//
//    public boolean check(String str){
//        boolean isZero = str.charAt(0) == '0';
//        if (isZero) {
//            if (str.substring(0, str.length() / 2).contains("1")) {
//                return false;
//            }
//            if (str.substring(str.length() / 2).contains("0")) {
//                return false;
//            }
//        }
//        else{
//            if (str.substring(0, str.length() / 2).contains("0")) {
//                return false;
//            }
//            if (str.substring(str.length() / 2).contains("1")) {
//                return false;
//            }
//        }
//
//        return true;
//    }
//}

class Solution {
    public int countBinarySubstrings(String s) {


        char[] str = s.toCharArray();
        char prev = str[0];
        int contNum = 1;
        int res = 0;
        for (int i = 1; i < str.length; i++) {
            if (str[i] == prev) { //00 or 11
                contNum++; //storing number of consecutive numbers
            } else {
                //when we meet not equal number so we move forward using j index, i stays the same
                // and counting all not equal to prev numbers
                for (int j = i; contNum > 0 && j < str.length; j++) {
                    if (str[j] != prev) {
                        res++;
                        contNum--;
                    } else {
                        break;
                    }
                }
                //once it's done i becomes next first number
                prev = str[i];
                contNum = 1;
            }
        }
        return res;

    }
}