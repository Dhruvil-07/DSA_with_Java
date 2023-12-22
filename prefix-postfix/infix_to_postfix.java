
import java.util.Scanner;

class infix
{
    public static void main(String[] args) 
    {
        
        //scanner class obect
        Scanner sc = new Scanner(System.in);

        //infix string input
        String user_infix;
        System.out.println("Enter Expression : ");
        user_infix = sc.next();

        //postfix class obj
        postfix ps = new postfix(user_infix);

        //var for choice and looping
        int choice;
        boolean check = true;

        while (check) 
        {
            System.out.println();
            System.out.println("1. Infix to Postfix...");
            System.out.println("2. Exit");

            System.out.println("Enter choice : ");
            choice = sc.nextInt();

            switch (choice) {
                
                case 1 : System.out.println("Postfix obj call");
                         ps.display();
                         break;

                case 2 : check = false;
                         break;

                default : System.out.println("Invalid choice...");
            }
        }

    }
}



class postfix
{
    String infix_expression;
    String result_expression = new String();
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



        //pop all reamiing vlaus
       while (top != -1) {
            pop();
       }


       //print esult string 
       System.out.println(result_expression);


    }



}
