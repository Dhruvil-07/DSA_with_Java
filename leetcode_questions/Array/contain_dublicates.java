/*
 q217 -> Contains Duplicate

 DESC:-
 ---------------
 Given an integer array nums, return true if any value appears 
 at least twice in the array, and return false if every element is distinct.

 EXAMPLE:-
 -----------------
    Example 1:
    Input: nums = [1,2,3,1]
    Output: true

    Example 2:
    Input: nums = [1,2,3,4]
    Output: false

    Example 3:
    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true
 */

import java.util.*;

public class contain_dublicates {
    
    public static boolean containsDuplicate(int[] nums) 
    {
        //use set , which contain unique values
        Set<Integer> s = new HashSet<Integer>();

        for(int i : nums)
        {
            s.add(i);
        }

        if(nums.length == s.size())
        {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {      
        int[] nums = {1,2,3,4};
        boolean result = containsDuplicate(nums);
        System.out.println(result);
    }
}


/*

//not bad solution  , but time limit exist

   public static boolean containsDuplicate(int[] nums) 
    {

        if(nums.length != 0)
        {
            ArrayList<Integer> li = new ArrayList<Integer>();

            for(int i : nums)
            {
                if(li.contains(i))
                {
                    return true;
                }
                else
                {
                    li.add(i);
                }
            }

        }
        
        return false;
    }
 */