package warmup.page1.defanginganIPaddress;

/**
 * @Author: Peixiao Zhao
 */
class Solution {
    public String defangIPaddr(String address) {
        String res = "";
        for (int i = 0; i < address.length(); i ++){
            if (address.charAt(i) == '.'){
                res += "[.]";
            }
            else{
                res += address.charAt(i);
            }
        }
        return res;
    }
}
