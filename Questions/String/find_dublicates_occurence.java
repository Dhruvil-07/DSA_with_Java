/*
 Q->Print all the duplicate characters in a string

 DESC:-
 -------------------
 Given a string S, the task is to print all the duplicate 
 characters with their occurrences in the given string.

 EXAMPLE:-
 -------------------
 Input: S = “geeksforgeeks”
 Output:

e, count = 4
g, count = 2
k, count = 2
s, count = 2
 */

import java.util.HashMap;
import java.util.Map;

public class find_dublicates_occurence 
{
    static void print_dublicate(String s)
    {   
        //create hash map
        Map<Character,Integer> m = new HashMap<Character,Integer>();

        for(int i=0 ; i<s.length() ; i++)
        {
            if( m.containsKey(s.charAt(i)) )
            {
                int val = m.get(s.charAt(i));
                m.put(s.charAt(i), ++val);
            }
            else
            {
                m.put(s.charAt(i), 1);
            }
        }


        //print all occurence 
        for(Map.Entry<Character,Integer> mr : m.entrySet())
        {
            if(mr.getValue() >= 2)
            {
                System.out.println(mr.getKey() + " " + mr.getValue());
            }
        }
    }

    public static void main(String[] args) 
    {
        String s = "geeksforgeeks";
        print_dublicate(s);
    }
}