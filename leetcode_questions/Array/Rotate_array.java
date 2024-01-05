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

class Rotata_array
{
    public static void main(String[] args) 
    {
        int nums[] = {-1};
        int k = 2;


        if(k>=nums.length)
        {
            //print array
            for(int i = 0 ; i<nums.length ; i++)
            {
                System.out.print(nums[i] + " ");
            }
        }
        else
        {
            int temp_array[] = new int[k];
            int x =0;

            //put ellement in temp array
            for(int i = nums.length-k ; i<nums.length ; i++)
            {
                temp_array[x] = nums[i];
                x++;
            }

            //change position of remaing element
            for(int j = nums.length-1-k ; j>=0 ; j--)
            {
                nums[j+k] = nums[j];
            }

            //put temp elemnt to actual array
            for(int z = 0 ; z<temp_array.length ; z++)
            {
                nums[z] = temp_array[z];
            }

            //print array
            for(int i = 0 ; i<nums.length ; i++)
            {
                System.out.print(nums[i] + " ");
            }

        }

        
    }
}