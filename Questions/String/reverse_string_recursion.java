/*
 Q->Print reverse of a string using recursion

 DESC:-
--------------------
Write a recursive function to print the reverse of a given string. 

EXAMPLE:-
-------------------
str = "Geeks for Geeks";
Output:- "skeeG rof skeeG";
*/

public class reverse_string_recursion 
{
    static void reverse(String str)
    {
        if(str.length()==0) return;

        //print last elemnt
        System.out.print(str.charAt(str.length()-1));

        //pass remianing string
        reverse(str.substring(0, str.length()-1));
    }

    public static void main(String[] args) 
    {
        String str = "greek for greek";
        reverse(str);
    }   
}

