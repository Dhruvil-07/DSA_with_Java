/*
 q.->Check whether two Strings are anagram of each other

 DESC:-
 -------------
 Given two strings. The task is to check whether the given strings are anagrams of 
 each other or not. An anagram of a string is another string that contains the same 
 characters, only the order of characters can be different. For example, “abcd” and “dabc” are an anagram of each other.

 EXAMPLE:-
 -------------
Input: str1 = “listen”  str2 = “silent”
Output: “Anagram”
Explanation: All characters of “listen” and “silent” are the same.

Input: str1 = “gram”  str2 = “arm”
Output: “Not Anagram”
 */


import java.util.*;

public class anagrame_string 
{   
    static boolean check_anagrams(String s1 , String s2)
    {
        if(s1.length() != s2.length()) return false;

        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        for(int i=0 ; i<c1.length ; i++)
        {
            if(c1[i] != c2[i])
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        if(check_anagrams("hello", "heloo"))
        {
            System.out.println("anagrams");
        }
        else
        {
            System.out.println("not anagrams");
        }
    }    
}
