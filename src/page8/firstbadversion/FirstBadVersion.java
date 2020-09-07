package page8.firstbadversion;

/**
 * @author Peixiao Zhao
 * @date 2020/9/7
 */
abstract class VersionControl{
    abstract boolean isBadVersion(int version);
}

class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0, right = n;
        while (left < right){
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)){
                right = mid;
            }
            else{
                left = mid + 1;
            }
        }
        return left;
    }

    @Override
    boolean isBadVersion(int version) {
        return false;
    }
}
