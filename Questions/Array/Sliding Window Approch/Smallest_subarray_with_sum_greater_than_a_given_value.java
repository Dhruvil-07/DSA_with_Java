/*
Smallest subarray with sum greater than a given value
Last Updated : 21 Oct, 2023
Given an array arr[] of integers and a number x, the task is to find the smallest
subarray with a sum greater than the given value. 

Examples:

arr[] = {1, 4, 45, 6, 0, 19}
   x  =  51
Output: 3
Minimum length subarray is {4, 45, 6}
arr[] = {1, 10, 5, 2, 7}
   x  = 9
Output: 1
Minimum length subarray is {10}
arr[] = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}
    x = 280
Output: 4
Minimum length subarray is {100, 1, 0, 200}
arr[] = {1, 2, 4}
    x = 8
Output : Not Possible
Whole array sum is smaller than 8.
 */

public class Smallest_subarray_with_sum_greater_than_a_given_value 
{
    static int find_ans(int[] nums, int n ,int target)
    {
         int curr_sum = 0, min_len = n + 1;
         int start = 0, end = 0;
         while (end < n) {
    
             while (curr_sum <= target && end < n)
                 curr_sum += nums[end++];
  
             
             while (curr_sum > target && start < n) {
                 if (end - start < min_len)
                     min_len = end - start;
  
                 curr_sum -= nums[start++];
             }
         }

         //if all element of array added but curr_sum is still lower than targer
         if( (end == nums.length) && curr_sum<target)
         {
            min_len = 0;
         }

        return min_len;
    }

    public static void main(String[] args) 
    {
        //int[] nums = {1, 4, 45, 6, 0, 19}; int target=51;
        //int[] nums = {1, 11, 100, 1, 0, 200, 3, 2, 1, 250}; int target = 280;
        //int[] nums = {1,10,5,2,7}; int target = 9;
        int[] nums = {1, 2, 4}; int target = 8;
        System.out.println(find_ans(nums,nums.length, target));
    }    

}
