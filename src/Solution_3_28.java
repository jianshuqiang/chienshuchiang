/**
 * Created by Chienshuchiang on 2019/3/27 20:25
 */
public class Solution_3_28 {
    public int findPeak(int[] A) {
        // write your code here
        int len = A.length;
        if (len == 3) return 1;
        int l = 1, r = len - 2;
        while (l < r) {
            int m = l + ((r - l) >> 1);
            if (A[m] < A[m - 1]) 
                r = m - 1;                
            else if (A[m] > A[m + 1]) 
                return m;                
            else 
                l = m + 1;            
        }
        return l;
    }
}
