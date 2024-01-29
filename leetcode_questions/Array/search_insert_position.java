/*
35. Search Insert Position ->

 Given a sorted array of distinct integers and a target value, 
 return the index if the target is found. If not, return the index where it would be if it were inserted in order.

 You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

 */

public class search_insert_position 
{
    public static int searchInsert(int[] nums, int target) 
    {
        int position = 0;

        for(int i = 0 ; i<nums.length; i++)
        {
            if(target == nums[i])
            {
                position = i;
                break;
            }
            else if(target <= nums[i+1])
            {
                position = i+1;
                break;
            }
        }
        return position;
    }   
}
