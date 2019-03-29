/**
 * public class SVNRepo {
 *     public static boolean isBadVersion(int k);
 * }
 * you can use SVNRepo.isBadVersion(k) to judge whether 
 * the kth code version is bad or not.
*/
public class Solution_3_30 {
    /**
     * @param n: An integer
     * @return: An integer which is the first bad version.
     */
    public int findFirstBadVersion(int n) {
        // write your code here
        int l = 1, r = n, m;
        while (l < r) {
            System.out.println(l + "...." + r);
            m = l + ((r - l) >> 1);
            if (SVNRepo.isBadVersion(m))
                r = m;
            else 
                l = m + 1;
        }
        
        return l;
    }
}
