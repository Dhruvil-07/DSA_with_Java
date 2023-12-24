import java.util.Scanner;

class Infix
{
    public static void main(String[] args) 
    {
       //scanner class obect
        Scanner sc = new Scanner(System.in);

        //var for choice and looping
        int choice;
        String check = "y";

        while(check.equalsIgnoreCase("y"))
        {
            //infix string input
            String user_infix;
            System.out.println("Enter Expression : ");
            user_infix = sc.next();

            //postfix class obj
            postfix ps = new postfix(user_infix);

            //call display method of  postfix class
            ps.display();

            //for countinue programe for same as well as annother expression
            System.out.println();
            System.out.println("Press y/n");
            System.out.println("DO you want to continue : ");
            check = sc.next();
        }

        System.out.println("Programe End...");
    }
}



class postfix
{
    String infix_expression;
    String result_expression = new String();
    int success = 1;
    char a[];
    int top;

    postfix(String infix_expression)
    {
        this.infix_expression = infix_expression;
        a = new char[this.infix_expression.length()];
        top = -1;
    }



    //add character into resultstring
    void addtoresult(char ch)
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
        addtoresult(a[top]);
        top--;
    }



    //return precidenece
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
        else if((ch >= 'a' && ch<= 'z') || (ch<='Z' && ch>='A') ) 
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }

    
    void display()
    {
        for(int i = 0 ; i<infix_expression.length() ; i++)
        {
            char ch = infix_expression.charAt(i);

            int ch_prec = prec(ch);

            if(ch_prec == -1)
            {
                success = 0;
                System.out.println("You puted invalid character in expression...");
                break;
            }
            else if(ch_prec == 0)
            {
                addtoresult(ch);
            }
            else if(top == -1)
            {
                push(ch);
            }
            else 
            {
               int top_perc = prec(a[top]);


               if(ch_prec == 3 && top_perc == 3)
               {
                    push(ch);
               }
               else if(ch_prec > top_perc)
               {
                    push(ch);
               }
               else if(ch_prec<=top_perc)
               {
                    while (ch_prec <= top_perc) {
                        pop();

                        if(top == -1)
                        {
                            break;
                        }

                        top_perc = prec(a[top]);
                    }
                    push(ch);
               }

            }
        }


        //if no error in expression operation then excute part which writen below
        if(success == 1)
        {
            System.out.println(success);
            //pop all reamiing vlaus
            while (top != -1) {
                    pop();
            }

            //print result string 
            System.out.println( "Postfix Expression : " + result_expression);
        }

       
    }
}
