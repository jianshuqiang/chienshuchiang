/**
 * Created by Chienshuchiang on 2019/3/28 22:22
 */
public class Solution_3_29 {
    /**
     * @param nums: The integer array.
     * @param target: Target to find.
     * @return: The first position of target. Position starts from 0.
     */
    public int binarySearch(int[] nums, int target) {
        // write your code here
        int len = nums.length;
        if (len == 0) return -1;
        int l = 0, r = len - 1, m;
        for (;l < r;) {
            m = l + ((r - l) >> 1);
            if (nums[m] < target)
                l = m + 1;
            else if (nums[m] > target)
                r = m - 1;
            else {
                while (true){
                    m--;
                    if (nums[m] < target)
                        break;
                }
                return m + 1;
            }
        }
        return nums[l] == target ? l : -1;
    }
}
