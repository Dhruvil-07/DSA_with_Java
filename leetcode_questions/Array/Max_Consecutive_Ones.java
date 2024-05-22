/*
 q.485 -> Max Consecutive Ones

 DESC:-
 -----------------------
 Given a binary array nums, return the maximum number
  of consecutive 1's in the array.

EXAMPLE:-
------------------------
Example 1:
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. 
The maximum number of consecutive 1s is 3.

Example 2:
Input: nums = [1,0,1,1,0,1]
Output: 2

 */

public class Max_Consecutive_Ones 
{

    public static int findMaxConsecutiveOnes(int[] nums) 
    {
        int count = 0 ;
        int max = 0;

        for(int i=0 ;i<nums.length ;i++)
        {
            if(nums[i]==0)
            {
                if(max<=count)
                {
                    max = count;
                }
                count=0;
            }
            else
            {
                count++;
            }
        }

        if(max<=count)
        {
            max =count;
        }

        return max;
    }

    public static void main(String[] args) 
    {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }    
}
