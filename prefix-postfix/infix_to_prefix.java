import java.util.Scanner;

class Infix
{
    public static void main(String[] args) {
        
        //Scanner class obj
        Scanner sc = new Scanner(System.in);

        //looping variable
        String Check;
        Check = "y";

        while (Check.equalsIgnoreCase("y")) 
        {

            //user expresssion input
            String user_infix;
            System.out.println("Enter Expression : ");
            user_infix = sc.next();

            //prefix class obj
            prefix pr = new prefix(user_infix);

            //call display method  
            pr.display();


            //for continue programe or not
            System.out.println();
            System.out.println("Press Y/N");
            System.out.println("Do you want to continue : ");
            Check = sc.next();
        }

        System.out.println("Programe End..."); 
    }
}




class prefix
{
    String infix_expression;
    String result_expression = new String();
    String final_result_expresion = new String();
    char a[];
    int top;

    prefix(String infix_expression)
    {
        this.infix_expression = infix_expression;
        a = new char[this.infix_expression.length()];
        top = -1;
    }


    //method for  add character in output string
    void add(char ch)
    {
        result_expression += ch;
    }

    //stack push method
    void push(char ch)
    {
        top++;
        a[top] = ch;
    }


    //stack pop method
    void pop()
    {
        add(a[top]);
        top--;
    }



    //precedence check method
    int prec(char ch)
    {
        if(ch == '+' || ch == '-')
        {
            return 1;
        }
        else if(ch == '*' || ch == '/')
        {
            return 2;
        }
        else if(ch == '^')
        {
            return 3;
        }
        else
        {
            return -1;
        }
    }




    //method  for conver infix to prefix
    void display()
    {
        for(int i = infix_expression.length() - 1 ; i>=0 ; i--)
        {
            char ch = infix_expression.charAt(i);

            //character prescedence 
            int ch_prec = prec(ch);

            //stack's top element precedece
            int top_prec = prec(ch);
        }

    }


    

}