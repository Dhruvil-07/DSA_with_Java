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
            pr.conversion();

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
    String result_expression = "";
    int success = 1; 
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
        else if((ch >= 'a' && ch<= 'z' ) ||(ch>='A' && ch<='Z'))
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }




    //method  for conver infix to prefix
    void conversion()
    {
        for(int i = infix_expression.length() - 1 ; i>=0 ; i--)
        {
            char ch = infix_expression.charAt(i);

            //character prescedence 
            int ch_prec = prec(ch);

            if(ch_prec == -1)
            {
                System.out.println("You puted invalid character in expression");
                success = 0;
                break;
            }
            else if(ch_prec == 0)
            {
                add(ch);
            }
            else if(top == -1)
            {
                push(ch);
            }
            else
            {
                //stack's top element precedence
                int top_perc = prec(a[top]);

                if(ch_prec > top_perc || ch_prec == top_perc)
                {
                    push(ch);
                }
                else
                {
                    while (ch_prec < top_perc)
                    {
                        pop(); 

                        if(top == -1)
                        {
                            push(ch);
                            break;
                        }
                        else
                        {
                            top_perc = prec(a[top]);
                            if(top_perc == ch_prec)
                            {
                                push(ch);
                                break;
                            }
                        }
                    }
                }
            }      
        }    

            //no error in expression opreation then part will execute which is written below.
            if(success == 1)
            {
                //loop run until stack is not empty
                while (top != -1) 
                {
                    pop();
                }

                //reverse our result
                for(int i = result_expression.length() - 1 ; i>=0 ; i--)
                {
                        char rev = result_expression.charAt(i);
                        System.out.print(rev);
                }
            }
    }
}