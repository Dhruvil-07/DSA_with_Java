/*
Q->Find first non-repeating character of given String

DESC:-
------------------
Given a string S consisting of lowercase Latin Letters, the 
task is to find the first non-repeating character in S.

Examples:-
-------------------------
Input: “geeksforgeeks”
Output: f
Explanation: As ‘f’ is first character in the string which does not repeat.
 */

public class first_non_repeated_char 
{
    static Character first_char(String str) 
    {
        Character ch = null;

        for(int i=0 ;i<str.length() ; i++)
        {
            int count = 0;

            for(int j=0 ; j<str.length() ;j++)
            {
                if(count >= 2) break;
                else if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }

            if(count == 1)
            {
                ch = str.charAt(i);
                break;
            }

        } 
        return ch;
    }

    public static void main(String[] args) 
    {
        String str = "geeksforgeeks";
        System.out.println("first non repeted chaeacter : "+first_char(str));
    }
}


/*

 */