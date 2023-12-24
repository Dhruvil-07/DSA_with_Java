import java.util.Scanner;

class infix
{
    public static void main(String[] args) {
        
        //Scanner class obj
        Scanner sc = new Scanner(System.in);

    }
}




class prefix
{
    String infix_expression = new String();
    String result_expression = new String();
    String final_result_expresion = new String();
    char a[];
    int top;

    prefix(String infix_expression)
    {
    
        char z[] = infix_expression.toCharArray();
        for(int i = z.length -1 ; i>=0 ; i--)
        {
            this.infix_expression += z[i];
        }
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

                if(ch_prec > top_perc)
                {
                    push(ch);
                }
                else if(ch_prec <= top_perc)
                {
                    while (ch_prec <= top_perc) {
                        if(ch_prec == top_perc)
                        {
                            push(ch);
                            break;
                        }

                        pop();

                        if(top == -1)
                        {
                            push(ch);
                        }
                        else
                        {
                            top_perc = prec(a[top]);
                        }
                        
                    }
                }
            } 


            System.out.println(result_expression);

        }



         //all remaing character poped
            while (top != -1) {
                pop();
            }   

            //print result  
            System.out.println(result_expression);
            
    }

}