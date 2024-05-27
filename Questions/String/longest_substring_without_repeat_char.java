/*
Q->Length of the longest substring without repeating characters

DESC:-
------------------------
Given a string str, find the length of the 
longest substring without repeating characters. 

Example:-
---------------------
Example 1:-
Input: “ABCDEFGABEF”
Output: 7
Explanation: The longest substring without repeating 
characters are “ABCDEFG”, “BCDEFGA”, and “CDEFGAB” 
with lengths of 7

Example 2:-
Input: “GEEKSFORGEEKS”
Output: 7
Explanation: The longest substrings without repeating 
characters are “EKSFORG” and “KSFORGE”, with lengths 
of 7
 */

import java.util.*;

public class longest_substring_without_repeat_char 
{

    static int find_longest_substring(String str)
    {
        int max = 0;
        int l = 0;
        int r = 0;

        //set
        Set<Character> s = new HashSet<Character>();

        while (r<str.length()) 
        {
            char c = str.charAt(r);
            if( s.add(c) ) 
            {
                max = Math.max(max, (r-l+1));
                r++;
            }
            else
            {
                while (str.charAt(l) != c) 
                {
                    s.remove(str.charAt(l));
                    l++;
                }
                s.remove(str.charAt(l));
                l++;
            }   
        }

        return max;
    }

    public static void main(String[] args) {
      System.out.println(find_longest_substring("pwwkew"));
    }    
}
