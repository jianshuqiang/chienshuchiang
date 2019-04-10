 public class Solution {
    /**
     * @param A: an integer array
     * @return: nothing
     */
    public void sortIntegers2(int[] A) {
        // write your code here
        sortIntegers(A, 0, A.length - 1);
    }
  
    public void sortIntegers (int[] A, int left, int right) {
        if (left >= right) return;
        int l = left, r = right;
        int key = A[left];
        while (l < r) {
            while (A[r] >= key && l < r) r--;
            while (A[l] <= key && l < r) l++;
            if (l < r) 
                swap(A, l, r);
            else
                break;
        }
        A[left] = A[l];
        A[l] = key;
        sortIntegers(A, left, l - 1);
        sortIntegers(A, l + 1, right);
        
    }
    
    public void swap (int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
    }
}
