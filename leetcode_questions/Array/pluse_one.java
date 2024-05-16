/*
 ou are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].


 */

public class pluse_one {
    public static void main(String[] args) {
        int[] digit = {2};
        int[] result = new int[digit.length];
        Solution s = new Solution();

        result =  s.plusOne(digit);

        System.out.println("actuall array : ");
        for(int i = 0 ; i<digit.length ; i++)
        {
            System.out.print(digit[i] + " ");
        }

        System.out.println("\n incresed array : ");
        for(int i = 0 ; i<result.length ; i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}


class Solution {

    public int[] plusOne(int[] digits) 
    {
        String joined = "";
        int[] result = new int[digits.length];
        
        //create string
        for(int i = 0 ; i<digits.length ; i++)
        {
            joined += digits[i];
        }

        //convert into num and increase by one
        int num = (Integer.valueOf(joined) + 1);

        //convert new number into string
        joined = Integer.toString(num);

        //put number into digits
        for(int i = 0 ; i<joined.length() ; i++)
        {
            result[i] = joined.charAt(i) - 48;
        }

        return result;
    }
}
