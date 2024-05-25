/*
 q->Check if given strings are rotations of each other or not

 DESC:-
 ----------------
Given a string s1 and a string s2, write a function to check whether s2 is a rotation of s1. 

EXAMPLES:-
----------------------
Input: S1 = ABCD, S2 = CDAB
Output: Strings are rotations of each other

Input: S1 = ABCD, S2 = ACBD
Output: Strings are not rotations of each other
 */
public class string_rotation 
{
   
    //find pattern using KMP (Knuth Morris Pratt)  string matching aloridhem
    static void rotation_match(String s1, String s2)
    {    
        String temp = (s1+s1);

        for(int i=1 ; i<s1.length() ; i++)
        {
            String founded_pattern = temp.substring(i, i+4);

            if(s2.compareTo(founded_pattern) == 0) 
            {
                System.out.println("string is in rotation");
                return;
            }
        }

        System.out.println("String is not in rotation");
    }

    public static void main(String[] args) {
        rotation_match("abcd", "cdab");
    }
}

/*

//first approch

  static void  rotation_check(String s1, String s2)
    {
        if(s1.length() != s2.length()) System.out.println("not rotation");
        else
        {
            String temp = s1;
            for(int i=0 ; i<s1.length()-1; i++)
            {
                char ch = temp.charAt(0);
                temp = temp.substring(1,temp.length());
                temp += ch;

                if(temp.compareTo(s2) == 0)
                {
                    System.out.println("String is in rotation");
                    return;
                }
            }
            System.out.println("String is not in rotation");
        }
    }
 */