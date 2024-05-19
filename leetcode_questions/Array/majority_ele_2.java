/*
 229. Majority Element II
 ----------------------------

 DESC:-
 --------------------
 Given an integer array of size n,
find all elements that appear more than ⌊ n/3 ⌋ times.

EXAMPLE:-
---------------------
Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]


 */

import java.util.*;

public class majority_ele_2 
{
     public static List<Integer> majorityElement(int[] nums) 
    {
        //list
        List<Integer> list=new ArrayList<Integer>();
        
        //map
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

        //check more than nums.length/3
        for(Map.Entry<Integer,Integer> mr : m.entrySet())
        {
            if(mr.getValue() >= Math.round(nums.length/3))
            {
                list.add(mr.getKey());
            }
        }

        return list;
    }    

    public static void main(String[] args) 
    {
        int[] nums = {1,2,2,2,2,3,3,3,3};
        List<Integer> li = new ArrayList<Integer>();
        li = majorityElement(nums);

        for(int i : li)
        {
            System.out.println(i);
        }
    }
}
