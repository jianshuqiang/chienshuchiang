/**
 * Created by Chienshuchiang on 2019/3/27 10:51
 */

public class Solution_3_27 {
    /**
     * @param nums: An integer array sorted in ascending order
     * @param target: An integer
     * @return: An integer
     */
    public int findPosition(int[] nums, int target) {
        if (nums.length == 0) return -1;
        if (target<nums[0] || target>nums[nums.length - 1]) return -1;
        // write your code here
        return binarySearich(nums, target, 0, nums.length - 1);
    }

    public int  binarySearich(int a[], int value, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (low == high) return a[low] == value?low:-1;
            if (a[mid] == value) return mid;
            if (a[mid] < value) low = mid+1;
            if (a[mid] > value) high=mid-1;
        }
        return -1;
    }
}
