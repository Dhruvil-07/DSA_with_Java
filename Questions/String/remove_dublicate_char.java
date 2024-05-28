/*
Q->Remove duplicates from a given string

DESC:-
-------------
Given a string S which may contain lowercase and uppercase 
characters. The task is to remove all duplicate characters 
from the string and find the resultant string.

Note: The order of remaining characters in the output 
should be the same as in the original string.

Example:-
--------------------
Input: Str = geeksforgeeks
Output: geksfor
Explanation: After removing duplicate characters such as e, k, g, s, we have string as “geksfor”.

Input: Str = HappyNewYear
Output: HapyNewYr
Explanation: After removing duplicate characters such as p, e, a, we have string as “HapyNewYr”.
 */

public class remove_dublicate_char 
{

    //first approch
    static String remove_dublicate(String str)
    {
        String result = "";

        for(int i=0 ; i<str.length() ; i++)
        {
            String s = String.valueOf(str.charAt(i));

            if(!(result.contains(s)) )
            {
                result += s;
            }
        }

        return result;
    }


    //second approch
    /* 
    static String remove_dublicate(String str)
    {
        String result = "";
        String temp = str;

        int i=0;
        while (i<temp.length()) 
        {
            String ch = String.valueOf(temp.charAt(i));
            if(ch != " ")    
            {
                result += ch;
                temp = temp.replace(ch, "");
            }
        }

        return result.replace(" ", "");
    }
    */

    public static void main(String[] args) 
    {
        System.out.println("WithOut Dublicate character : " + remove_dublicate("happy new Year"));
    }    
}
