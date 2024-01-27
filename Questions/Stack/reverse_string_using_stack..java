/*

Input: str = “GeeksQuiz”
Output: ziuQskeeG

Input: str = “abc”
Output: cba
 */


import java.util.Scanner;

class reverse_string_using_stack
{
    public static void main(String[] args) 
    {
        //Scanner class object
        Scanner sc = new Scanner(System.in);

        //get input from user
        System.out.println("Enter String : ");
        String input_string = sc.next();

        stack st = new stack(input_string);

        System.out.println("Reverse String : " + st.result_string);

    }
}

class stack
{
    int top;
    String input_string;
    String result_string = new String();
    char ch[];


    stack(String input_string)
    {
        this.input_string = input_string;
        ch = new char[input_string.length()];
        top = -1;
        push();
        pop();
    }

    //push method
    void push()
    {
        for(int i = 0 ; i<input_string.length() ; i++)
        {
            top++;
            ch[top] = input_string.charAt(i);
        }
    }

    //pop method
    void pop()
    {
        for(int i = top ; i>=0 ; i--)
        {
            result_string += ch[i];
        }
    }
}