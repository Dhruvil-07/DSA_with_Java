/*
 q.2404->Most Frequent Even Element

 DESC:-
 --------------
 Given an integer array nums, return the most frequent even element.

If there is a tie, return the smallest one. 
If there is no such element, return -1.

EXAMPLE:-
--------------------
Example 1:
Input: nums = [0,1,2,2,4,4,1]
Output: 2
Explanation:
The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
We return the smallest one, which is 2.

Example 2:
Input: nums = [4,4,4,9,2,4]
Output: 4
Explanation: 4 is the even element appears the most.

Example 3:
Input: nums = [29,47,21,41,13,37,25,7]
Output: -1
Explanation: There is no even element.
 */

import java.util.HashMap;
import java.util.Map;

import javax.swing.RowFilter.Entry;

class most_frequent_even_ele
 {
    public static int mostFrequentEven(int[] nums) 
    {
        //max enrty
        Map.Entry<Integer,Integer> maxEntry = null;

        //map
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();

        //mapping 
        for(int i : nums)
        {
            if(i%2 == 0)
            {
                if(m.containsKey(i))
                {
                    int count = m.get(i);
                    m.put(i, ++count);
                }
                else
                {
                    m.put(i, 1);
                }
            }
        }


        //find max occurence key
        for(Map.Entry<Integer,Integer> currEntry : m.entrySet())
        {
            if(maxEntry == null || maxEntry.getValue()<currEntry.getValue())
            {
                maxEntry = currEntry;
            }
            else if(currEntry.getValue() == maxEntry.getValue())
            {
                maxEntry = currEntry.getKey()<maxEntry.getKey() ? currEntry : maxEntry;
            }
        }

        //return value 
        if(m.isEmpty())
        {
            return -1;
        }
        else
        {
            return maxEntry.getKey();
        }
        
    }

    public static void main(String[] args) 
    {
        int[] nums = {29,47,21,41,13,37,25,7};
        System.out.println("element : "+ mostFrequentEven(nums));
    }
 }