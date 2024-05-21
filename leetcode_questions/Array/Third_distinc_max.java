/*

q.414->Third Maximum Number

DESC:-
--------------

Given an integer array nums, return the third distinct maximum number 
in this array. If the third maximum does not exist, 
return the maximum number.

ESXAMPLE:-
--------------
Example 1:
Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.

Example 2:
Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.

Example 3:
Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.
 */

import java.util.*;

class Third_distinc_max {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> s = new HashSet<>();
        for (int i : nums) {
            s.add(i);
        }

        ArrayList<Integer> li = new ArrayList<Integer>(s);

        return li.size() >= 3 ? li.get(li.size() - 3) : li.get(li.size() - 1);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 2, 3, 1 };
        System.out.println("distinct Third max :" + thirdMax(nums));
    }
}