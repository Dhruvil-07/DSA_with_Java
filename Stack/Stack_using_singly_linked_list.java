//satck implimentation usign singly linked list 
//insert , delete and display opration


import java.util.Scanner;

class StackStructureUsingSLL
{
    public static void main(String[] args) {
        
        //scanner class obj
        Scanner sc = new Scanner(System.in);

        //StackUsingSLL class obj
        StackUsingSLL stack = new StackUsingSLL();

        //variable for choice,val, and looping
        int val , choice;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Push Element...");
            System.out.println("2. Pop Element...");
            System.out.println("3. Display");
            System.out.println("4. Exit...");

            //get choice from user 
            System.out.println("Enter Your Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Enter Value : ");
                         val = sc.nextInt();
                         stack.push_element(val);
                         break;

                case 2 : stack.pop_element();
                         break;

                case 3 : stack.display();
                         break;

                case 4 : check = false;
                         break;
                
                default : System.out.println("Invalid Choice...");
                          break;
                        
            }

        }

        System.out.println("Stack Programe End...");
    }
}

class StackUsingSLL
{

    //node class 
    static class Node
    {
        int val;
        Node next;

        Node(int val)
        {
            this.val = val;
            this.next = null;
        }
      
    }


    //intializa head and link
    Node head = null;
    int link = 0;

    //push Element
    void push_element(int val)
    {
        Node new_node = new Node(val);

        if(head == null)
        {
            head = new_node;
            System.out.println("Inserted Successfully...");
            link++;
            System.out.println(link + " Exist");
        }
        else
        {
            new_node.next = head;
            head = new_node;
            System.out.println("Inserted Successfully...");
            link++;
            System.out.println(link + " Exist");
        }
    }

    
    //pop element
    void pop_element()
    {
        if(head == null)
        {
            System.out.println("Stack is Under flow....");
        }
        else
        {
            Node temp = head;
            temp = temp.next;
            head = temp;
            System.out.println("Deleted Successfully...");
            link--;
            System.out.println(link  + " Exist");
        }
    }


    
    //display
    void display()
    {
        if(head == null)
        {
            System.out.println("Stack is Under Flow...");
        }
        else
        {
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

}