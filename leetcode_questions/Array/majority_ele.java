/*
169. Majority Element

DESC:-
-------------------

Given an array nums of size n, return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. 
You may assume that the majority element always exists in the array.


EXAMPLE:-
-------------------
Example 1:
Input: nums = [3,2,3]
Output: 3

Example 2:
Input: nums = [2,2,1,1,1,2,2]
Output: 2

*/

import java.util.HashMap;
import java.util.Map;

class majority_ele
{

    public static int majorityElement(int[] nums) 
    {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        //mapping 
        for(int i : nums)
        {
            if(m.containsKey(i))
            {
                    int count = m.get(i);
                    m.put(i, ++count);
            }
            else
            {
                m.put(i,0);
            }
        }

        //check more than nums.length
        for(Map.Entry<Integer,Integer> mr : m.entrySet())
        {
            if(mr.getValue() >= Math.round(nums.length/2))
            {
                return mr.getKey();
            }
        }
        return 0;
    }

    public static void main(String[] args) 
    {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println("majority element : " + majorityElement(nums) );    

    }
}