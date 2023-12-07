//doubly linked list implimentation 
//insert , delete and display oprations

import java.util.Scanner;

class DoublyLLSturcture
{
    public static void main(String args[])
    {
        //scanner class obj
         Scanner sc = new Scanner(System.in);

        //CircularLL class obj
         DoublyLL dll = new DoublyLL();

        //welcome comment
        System.out.println("welcome to Doubly linked list programe....");

        //var for val , position , choice and looping
        int val , choice, position;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Insert at beginng...");
            System.out.println("2. Insert at end...");
            System.out.println("3. Insert at specific position...");
            System.out.println("4. Delete from beging...");
            System.out.println("5. Delete from end...");
            System.out.println("6. Delete from specific position...");
            System.out.println("7. Display...");
            System.out.println("8. Exit...");


            System.out.println("Enter Your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Enter value : ");
                         val = sc.nextInt();
                         dll.insert_at_beging(val);
                         break;

                case 2 : System.out.println("Enter value : ");
                         val = sc.nextInt();
                         dll.insert_at_end(val);
                         break;

                case 3 : System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         System.out.println("Enter value : ");
                         val = sc.nextInt();
                         dll.insert_at_spec_pos(val, position);
                         break;

                case 4 : dll.delete_from_beging();
                         break;

                case 5 : dll.delete_from_end();
                         break;

                case 6 : System.out.println("Enter Your Position : "); 
                         position = sc.nextInt();
                        dll.delete_from_spec__pos(position);
                         break;

                case 7 : dll.display();
                         break;

                case 8 : check = false;
                         break;

                default : System.out.println("Invalid choice....");

                
            }

        }

        System.out.println("Cirrcular Linked List Programe End.... ");
    }
    
}


class DoublyLL
{

    static class Node
    {
        int val;
        Node next;
        Node prev;

        Node(int val)
        {
            this.val = val;
            this.next = null;
            this.prev = null;
        }

    }

    //intialize head , tail and link
    Node head = null;
    Node tail = null;
    int link = 0;


    //inset at beging
    void insert_at_beging(int val)
    {
        Node new_node = new Node(val);

        if(head == null)
        {
            head = new_node;
            tail = new_node;
            System.out.println("inserted Successfully...");
            link++;
            System.out.println(link + " Exist");
        }
        else
        {
            new_node.next = head;
            head.prev = new_node;
            head = new_node;
            System.out.println("Inserted successfully...");
            link++;
            System.out.println(link + " Exist");
        }
    }

    //insert at end
    void insert_at_end(int val)
    {
        Node new_node = new Node(val);
        if(head == null)
        {
            head = new_node;
            tail = new_node;
            System.out.println("Inserted successfully...");
            link++;
            System.out.println(link + " Exist");
        }
        else
        {
            Node temp = tail;
            temp.next = new_node;
            new_node.prev = temp;
            tail = new_node;
            System.out.println("Insrted successfully...");
            link++;
            System.out.println(link + " Exist");
        }
    }

    //insert at specific position
    void insert_at_spec_pos(int val , int position)
    {
        Node new_node = new Node(val);
        if(head == null)
        {
            System.out.println("Linked List Not Exist...");
            System.out.println("First create it...");
        }
        else if(position == link+2)
        {
            //execute when user enter invalid position
            System.out.println("Only " + link + " Exist");
        }
        else if(position == 1)
        {
            insert_at_beging(val);
        }
        else if(position == link+1)
        {
            insert_at_end(val);
        }
        else if(position <= link/2)
        {
            Node temp = head;
            Node ptr = temp.next;
            for(int i = 2 ; i<position ; i++)
            {
                temp = ptr;
                ptr = ptr.next;
            }
            new_node.next = temp.next;
            new_node.prev = ptr.prev;
            temp.next = new_node;
            ptr.prev = new_node;
            System.out.println("Inserted sucessfully...");
            link++;
            System.out.println(link + " Exist");

        }
        else
        {
           Node temp = tail;
           Node ptr = temp.prev;
           for(int i = link - 1 ; i>=position ; i--)
           {
             temp = ptr;
             ptr = ptr.prev;
           }
           new_node.next = ptr.next;
           new_node.prev = temp.prev;
           ptr.next = new_node;
           temp.prev = new_node;
           System.out.println("Inserted Sucessfully...");
           link++;
           System.out.println(link + " Exist");
        }
        
    }

    //delete from beging 
    void delete_from_beging()
    {
        if(head == null)
        {
            System.out.println("Linked list not exist...");
        }
        else if(link == 1)
        {
            head = null;
            tail = null;
            System.out.println("Deleted Successfully...");
            link--;
            System.out.println(link + " Exist");
        }
        else
        {
            Node temp = head;
            temp = temp.next;
            temp.prev = null;
            head = temp;
            System.out.println("Deleted Successfully...");
            link--;
            System.out.println(link + " Exist");
        }
    }

    //void delete form end
    void delete_from_end()
    {
        if(head == null)
        {
            System.out.println("Linked List Not Exist...");
        }
        else if(link == 1)
        {
            head = null;
            tail = null;
            System.out.println("Deleted Successfully....");
            link--;
            System.out.println(link + " Exist");
        }
        else
        {
            Node temp = tail;
            temp = temp.prev;
            temp.next = null;
            tail = temp;
            System.out.println("Deleted Successfulyy....");
            link--;
            System.out.println(link + " Exist");
        }
    }

    //void delete from specific position
    void delete_from_spec__pos(int position)
    {
        if(head == null)
        {
            System.out.println("Linked List not Exist");
        }
        else if(position > link)
        {
            System.out.println("Only " + link + " Exist");
        }
        else if(position == 1)
        {
            delete_from_beging();
        }
        else if(position == link)
        {
            delete_from_end();
        }
        else if(position <= link/2)
        {
            Node ptr = head;
            for(int i = 2 ; i<=position ; i++)
            {
                ptr = ptr.next;
            }
            Node temp = ptr.prev;
            Node temp2 = ptr.next;
            temp.next = ptr.next;
            temp2.prev = ptr.prev;
            System.out.println("Deleted Successfully....");
            link--;
            System.out.println(link + " Exist");
        }
        else
        {
            Node ptr = tail;
            for(int i = link -1 ; i>=position ; i--)
            {
                ptr = ptr.prev;
            }
            Node temp = ptr.prev;
            Node temp2 = ptr.next;
            temp.next = ptr.next;
            temp2.prev = ptr.prev;
            System.out.println("Deleted Successfully...");
            link--;
            System.out.println(link + " Exist");
        }


    }

    //display
    void display()
    {
        if(head == null)
        {
            System.out.println("Linked List not Exist");
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