package warmup.page4.romantointeger;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public int romanToInt(String s) {
        int i = 0;
        for (int x = 0; x < s.length(); x++) {
            switch (s.charAt(x)) {
                case 'I':
                    if (x < s.length() - 1 && s.charAt(x + 1) == 'V') {
                        i += 4;
                        x++;
                    } else if (x < s.length() - 1 && s.charAt(x + 1) == 'X') {
                        i += 9;
                        x++;
                    } else {
                        i += 1;
                    }
                    break;
                case 'V':
                    i += 5;
                    break;
                case 'X':
                    if (x < s.length() - 1 && s.charAt(x + 1) == 'L') {
                        i += 40;
                        x++;
                    } else if (x < s.length() - 1 && s.charAt(x + 1) == 'C') {
                        i += 90;
                        x++;
                    } else {
                        i += 10;
                    }
                    break;
                case 'L':
                    i += 50;
                    break;
                case 'C':
                    if (x < s.length() - 1 && s.charAt(x + 1) == 'D') {
                        i += 400;
                        x++;
                    } else if (x < s.length() - 1 && s.charAt(x + 1) == 'M') {
                        i += 900;
                        x++;
                    } else {
                        i += 100;
                    }
                    break;
                case 'D':
                    i += 500;
                    break;
                case 'M':
                    i += 1000;
                    break;
            }
        }
        return i;
    }
}
