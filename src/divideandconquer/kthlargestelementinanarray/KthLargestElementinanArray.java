package divideandconquer.kthlargestelementinanarray;

/**
 * @author Peixiao Zhao
 * @date 2020/10/2 20:48
 */
class Solution {
    public int findKthLargest(int[] nums, int k) {
        return findK(nums, nums.length - k, 0, nums.length - 1);
    }

    public int findK(int[] nums, int k, int low, int high){
        if (low >= high){
            return nums[low];
        }

        int p = partition(nums, low, high);

        if (p == k){
            return nums[p];
        }
        else if (p < k){
            return findK(nums, k, p + 1, high);
        }else{
            return findK(nums, k, low, p - 1);
        }
    }

    public int partition(int[] nums, int low, int high){
        int privotKey = nums[low];
        while (low < high){
            while (low < high && nums[high] >= privotKey){
                high --;
            }
            swap(nums, low, high);

            while (low < high && nums[low] <= privotKey){
                low ++;
            }
            swap(nums, low, high);
        }

        return low;
    }

    public void swap(int[] nums, int low, int high) {
        int t = nums[low];
        nums[low] = nums[high];
        nums[high] = t;
    }
}
