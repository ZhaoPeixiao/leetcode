package binarysearch.firstbadversion;

/**
 * @author Peixiao Zhao
 * @date 2020/9/30 18:02
 */
class VersionControl{
    boolean isBadVersion(int version){
        return false;
    }
}

class Solution extends VersionControl{
    public int firstBadVersion(int n) {
        int low = 1, high = n;
        while (low < high){
            int mid = low + (high - low) / 2;

            if (isBadVersion(mid)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}
