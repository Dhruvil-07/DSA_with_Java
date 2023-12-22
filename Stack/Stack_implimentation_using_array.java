//stack implpimentation using array 
//insert , delete annd display opration 

import java.util.Scanner;


//main class  of  stack
class StackStructure
{
    public static void main(String args[])
    {
        //scaner class object
        Scanner sc =  new Scanner(System.in);

        //welcome code
        System.out.println("Welcome to Stack programe....");

        //get stack size input from user
        int total_element;
        System.out.println("How Many Element you want to enter in stack : ");
        total_element = sc.nextInt();

        
        //Stack class object
        Stack stack = new Stack(total_element);


        //variable for looping opration
        boolean check = true;

        
        //variable for user opration choice and value
        int choice , val;

        while(check)
        {
            System.out.println();
            System.out.println("1. Insert Element ");
            System.out.println("2. Delete Element");
            System.out.println("3. Display Stack");
            System.out.println("4. Exite");
            
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Enter your Element : ");
                         val = sc.nextInt();
                         stack.insert_element(val);
                         break;
                
                case 2 : stack.delete_element();
                         break;

                case 3 : stack.display();
                         break;

                case 4 : check = false;
                         break;
            }
        }  
    }
}



//STACK OPRATION CLASS
class Stack
{
    int[] a;
    int top;

    Stack(int size)
    {
        a = new int[size];
        top = -1;
    }


    //insert method
    void insert_element(int val)
    {
        if(top == a.length - 1)
        {
            System.out.println("Stck is FULL...");
            return;
        }
        else
        {
            top++;
            a[top] = val;
            System.out.println("Insert successfully...");
            display();
            return;
        }
    }




    //delete method
    void delete_element()
    {
        if(top == -1)
        {
            System.out.println("Stack is Empty...");
            return;
        }
        else
        {
            top--;
            System.out.println("Delete successfully...");
            display();
            return;
        }
    }




    //display stack
    void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty...");
        }
        else
        {
            for(int i = 0 ; i<=top ; i++)
            {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        return;
    }


}