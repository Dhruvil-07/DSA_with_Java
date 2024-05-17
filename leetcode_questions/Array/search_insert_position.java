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
        int position = -1;
        int l = 0;
        int u = nums.length-1;
        int mid;


        if(target < nums[0])
        {
            position = 0;
        }
        else if(target > nums[nums.length-1])
        {
            position = nums.length;
        }
        else
        {
            while (l<=u) 
            {
                mid = Math.round((l+u)/2);
    
                if(nums[mid] == target)
                {
                    position = mid;
                    break;
                }
                else if(nums[mid] > target)
                {
                    u = mid-1;
                    position = mid;
                }
                else if(nums[mid] < target)
                {
                    l = mid+1;
                }
            }
    
        }
        return position;
    }   

    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int position = searchInsert(nums, 6);
        System.out.println(position);
    }
}
