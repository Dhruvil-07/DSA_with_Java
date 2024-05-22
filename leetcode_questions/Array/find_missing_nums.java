/*
 q.448 -> Find All Numbers Disappeared in an Array

 DESC:-
 ----------------
 Given an array nums of n integers where nums[i] is in the 
 range [1, n], return an array of all the integers in the 
 range [1, n] that do not appear in nums.

 EXAMPLE:-
 ---------------
Example 1:
Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]

Example 2:
Input: nums = [1,1]
Output: [2]
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class find_missing_nums 
{
    public  static List<Integer> findDisappearedNumbers(int[] nums) 
    {
        //its take 5ms
        List<Integer> li =  new ArrayList<Integer>();

        for(int i : nums)
        {
            int idx = Math.abs(i)-1;

            if(nums[idx]>0)
            {
                nums[idx] *= -1;
            }
        }


        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i]>0)
            {
                li.add(i);
            }
        }

        return li;


        //it's take 17ms

        // List<Integer> li = new ArrayList<Integer>();

        // Set<Integer> s = new HashSet<Integer>();

        // for(int i : nums)
        // {
        //     s.add(i);
        // }
        
        // for(int i=1 ; i<=nums.length ; i++)
        // {
        //     if(!(s.contains(i)))
        //     {
        //         li.add(i);
        //     }
        // }

        // return li;

    }


    public static void main(String[] args) 
    {
        int[] nums = {};
        System.out.println(findDisappearedNumbers(nums));
    }
}
