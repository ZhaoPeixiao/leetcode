package warmup.page4.complementofbase10integer;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int bitwiseComplement(int N) {
        int X = 1;
        while (N > X) X = X * 2 + 1;
        return X - N;
    }
}


//class Solution {
//    public int bitwiseComplement(int N) {
//        String str = Integer.toBinaryString(N);
//        StringBuilder stringBuilder = new StringBuilder();
//        char[] chars = str.toCharArray();
//        for (char c : chars){
//            if (c == '1') {
//                stringBuilder.append("0");
//            }
//            else{
//                stringBuilder.append("1");
//            }
//        }
//        return Integer.parseInt(stringBuilder.toString(), 2);
//    }
//}