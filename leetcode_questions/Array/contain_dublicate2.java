/*
 q.219 -> Contains Duplicate II

 DESC:-
 ------------------
 Given an integer array nums and an integer k, return true 
 if there are two distinct indices i and j in
 the array such that nums[i] == nums[j] and abs(i - j) <= k.

 EXAMPLE:-
 -----------------
    Example 1:
    Input: nums = [1,2,3,1], k = 3
    Output: true

    Example 2:
    Input: nums = [1,0,1,1], k = 1
    Output: true

    Example 3:
    Input: nums = [1,2,3,1,2,3], k = 2
    Output: false
    
 */


import java.util.HashMap;
import java.util.Map;

public class contain_dublicate2 {
    
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //use hash map for mapping index and value
        Map<Integer,Integer> m =  new HashMap<Integer,Integer>();

        for(int i=0 ; i<nums.length ;i++)
        {
            //conatian methods check value is present or not in map 
            if(m.containsKey(nums[i]))
            {
                //get method provide value of passed key
                int pastidx = m.get(nums[i]);

                if( Math.abs(pastidx - i) <= k)
                {
                    return true;
                }
                else
                {
                    //put method use to put value inside map
                    m.put(nums[i], i);
                }
            }
            else
            {
                m.put(nums[i], i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        
        int[] nums = {1,2,3,1,2,3};
        boolean result = containsNearbyDuplicate(nums,2);
        System.out.println(result);
    }

}
