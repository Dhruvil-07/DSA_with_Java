/*
 Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]


Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 

Constraints:

1 <= nums.length <= 105
-231 <= nums[i] <= 231 - 1
0 <= k <= 105
 
 */


 /*
  use hashmap technique to find right index for element
  then put element on that index
  at last , copy all element from temp array to actual array
  */
class Rotata_array
{
    static int store_element(int index , int length , int k)
    {
        return (index+k)%length;
    }

    public static void main(String[] args) 
    {
        int nums[] = {1,2};
        int k = 3;

        int temp[] = new int[nums.length];

        for(int i = 0 ; i<nums.length ; i++)
        {
            int position = store_element(i, nums.length, k);
            temp[position] = nums[i];
        }

        for(int i = 0 ; i<temp.length ; i++)
        {
            nums[i] = temp[i];
        }

        for(int i = 0 ; i<nums.length ; i++)
        {
            System.out.print(nums[i] + " ");
        }
    }
} 