/*
q.->How to check if string contains only digits in Java

DESC:-
------------
Given string str, the task is to write a Java program to check whether a string contains 
only digits or not. If so, then print true, otherwise false. 

Examples: -
-----------------
Input: str = “1234” 
Output: true 
Explanation: 
The given string contains only digits so that output is true.

Input: str = “GeeksforGeeks2020” 
Output: false 
Explanation: 
The given string contains alphabet character and digits so that output is false.  
 */

public class string_contain_only_digit_check 
{
    static boolean check_didgits(String str)
    {
        for(int i : str.toCharArray())
        {
            if(i<48 || i>57)
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "12G34";
        System.out.println("result : "+check_didgits(str));
    }    
}
