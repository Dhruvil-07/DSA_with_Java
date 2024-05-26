/*
Q->Java program to check whether a string is a Palindrome


DESC:-
------------------
A string is said to be a palindrome if it is the same if 
we start reading it from left to right or right to left. 
In this article, we will learn how to check if a string is a palindrome in Java.

So let us consider a string “str”, now the task is just to find out with its reverse string is the same as it is. 

WXAMPLE:-
-------------------------------
Example of Palindrome:
Input: str = “abba” 
Output: Yes

Input: str = “geeks”
Output: No 
 */

public class pelindrom_string 
{

    static void pelindrom_check(String s)
    {
        String rev = "";

        for(int i=s.length()-1 ; i>-1 ;i--)
        {
            rev += s.charAt(i);
        }

        if(s.compareTo(rev) == 0) System.out.println("Pelindrom");
        else System.out.println("not pelindrom");
    }

    public static void main(String[] args) 
    {
        String str = "abba";
        pelindrom_check(str);
    }    
}
