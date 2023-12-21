//queue implimentation sing java
//insert delete and travel

import java.util.Scanner;

class QueueStructureusingll
{
    public static void main(String[] args) {
        //scanner class objeect
        Scanner sc = new Scanner(System.in);

        //Queue class object
        queuestruct q = new queuestruct();

        //variable for choice , val , and looping
        int val , choice;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Insert...");
            System.out.println("2. delete...");
            System.out.println("3. Display...");
            System.out.println("4. Exit....");

           System.out.println("Enter choice : ");
           choice = sc.nextInt();

           switch (choice) {
            case 1: System.out.println("Enter value : ");
                    val = sc.nextInt();
                    q.insert(val);
                    break;
            
            case 2 : q.delete();
                     break;

            case 3 : q.display();
                     break;

            case 4 : check = false;
                     break;
           
            default: System.out.println("Invalid choice....");
                break;
           }
        }
    }
    
}


class queuestruct
{   
    //node structure 
    static class Node
    {
        int data;
        Node next;

        Node(int val)
        {
            data = val;
            next = null;
        }
    }

    //intially head null
    Node head = null; //for for first node pointing


    void insert(int val)
    {
        Node new_node = new Node(val);

        if(head == null)
        {
            head = new_node;
            System.out.println("Inserted successfuly...");
            display();
            return;
        }
        else
        {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            //add new node
            temp.next = new_node;
            System.out.println("Inserted Successfully...");
            display();
            return;
        }
    }


    void delete()
    {
        if(head == null)
        {
            System.out.println("Linked List not Exist...");
            return;
        }
        else
        {
            head = head.next;
            System.out.println("Deleted successfully...");
            display();
            return;
        }
    }


    void display()
    {
        if(head == null)
        {
            System.out.println("Linked List not Exist");
            return;
        }
        else
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
    }

}