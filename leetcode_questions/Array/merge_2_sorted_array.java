/*
 leat code question -> 88

 explanaion:-
 You are given two integer arrays nums1 and nums2, 
 sorted in non-decreasing order, and two integers m and n, 
 representing the number of elements in nums1 and nums2 respectively.

Merge nums1 and nums2 into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, 
but instead be stored inside the array nums1. To accommodate this, 
nums1 has a length of m + n, where the first m elements denote the 
elements that should be merged, and the last n elements are set to 0 
and should be ignored. nums2 has a length of n.


Exampple :-

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

 */

public class merge_2_sorted_array {

    public static void main(String[] args) {
        
        int[] num1 = {0,0,0,0,0,0};
        int[] num2 = {1,2,3,4,5,6};
        int m = 0;
        int n = 5;

        Solution s = new Solution();
        s.merge(num1, m, num2, n);
    }

}

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int p = (nums1.length - 1);
        int idx1 = m-1;
        int idx2 = n-1;

        if(n == 0)
        {
            
        }
        else if(m == 0)
        {
            for(int i = 0 ; i<nums1.length ; i++)
            {
                nums1[i] = nums2[i];
            }
        }
        else
        {
            while ( (p != 0)  && (idx1 != -1)  && (idx2!=-1)) {          
                if(nums1[idx1] < nums2[idx2])
                {
                    nums1[p] = nums2[idx2];
                    p--;
                    idx2--;
                }
                else if(nums1[idx1] >= nums2[idx2])
                {
                    nums1[p] = nums1[idx1];
                    p--;
                    idx1--;
                }
            } 
            
            if(idx2 == p)
            {
                for(int i = p ; i>-1 ; i--)
                {
                    nums1[i] = nums2[i];
                }
            }
            else if(idx2>-1)
            {
                nums1[p] = nums2[idx2];
            }
        }

        
        for(int i = 0 ; i<nums1.length ; i++)
        {
            System.out.print(nums1[i] + " ");
        }
        
    }

}