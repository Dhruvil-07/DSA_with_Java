/*
To find the maximum sum of all subarrays of size K:
Given an array of integers of size ‘n’, Our aim is to calculate the maximum sum of ‘k’ 
consecutive elements in the array.

Input  : arr[] = {100, 200, 300, 400}, k = 2
Output : 700

Input  : arr[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}, k = 4 
Output : 39
We get maximum sum by adding subarray {4, 2, 10, 23} of size 4.

Input  : arr[] = {2, 3}, k = 3
Output : Invalid
There is no subarray of size 3 as size of whole array is 2.
 */

public class Max_sum_of_subArray 
{

        static int find_max_sum(int[] nums , int k)
        {
            if(nums.length < k)
            {
                return 0;
            }

            int window_sum = 0;
            int max_sum = 0;
            
            //first window sum
            for(int i=0 ; i<k ; i++)
            {
                max_sum += nums[i];
            }

            int l=1;
            int r=k;
            window_sum = max_sum;
            //now slide window and find max sum
            while (r<nums.length) 
            {
                window_sum = ((window_sum + nums[r]) - nums[l-1]);
                max_sum = Math.max(max_sum, window_sum);
                l++;r++;
            }

           return max_sum;
        }

        public static void main(String[] args) 
        {
            //int[] nums = {100, 200, 300, 400}; int k = 2;
            //int nums[] = {1, 4, 2, 10, 23, 3, 1, 0, 20}; int k=4;
            int nums[] = {2, 3}, k = 3;

            System.out.println(find_max_sum(nums, k));
        }
}