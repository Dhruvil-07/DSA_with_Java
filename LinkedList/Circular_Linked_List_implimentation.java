//Circular linked list implimentation
//insret , delete and display opration

import java.util.Scanner;

//main class for circular linked list
class CircularLLStructure
{
    public static void main(String args[])
    {
        //scanner class obj
         Scanner sc = new Scanner(System.in);

        //CircularLL class obj
        CircularLL cll = new CircularLL();

        //welcome comment
        System.out.println("welcome to circular linked list programe....");

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
                         cll.insert_at_beging(val);
                         break;

                case 2 : System.out.println("Enter value : ");
                         val = sc.nextInt();
                         cll.insert_at_end(val);
                         break;

                case 3 : System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         System.out.println("Enter value : ");
                         val = sc.nextInt();
                         cll.insert_at_spec_pos(val, position);
                         break;

                case 4 : cll.delete_from_beging();
                         break;

                case 5 : cll.delete_from_end();
                         break;

                case 6 : System.out.println("Enter Your Position : "); 
                         position = sc.nextInt();
                        cll.delete_from_spec__pos(position);
                         break;

                case 7 : cll.display();
                         break;

                case 8 : check = false;
                         break;

                default : System.out.println("Invalid choice....");

                
            }

        }

        System.out.println("Cirrcular Linked List Programe End.... ");
    }

}


//class for circular linked list opration
class CircularLL
{

    //node genrater class
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

    //intially head and tail are null
    Node head = null;
    Node tail = null;
    int link = 0;   //for count how many are exist...



    //insert at begining
    void insert_at_beging(int val)
    {
        Node new_node = new Node(val);

        if(head == null)
        {
            head = new_node;
            new_node.next = head;
            tail = head;
            System.out.println("Inserted successfully...");
            link++;
            System.out.println(link + " Exist");
        }
        else
        {
            new_node.next = head;
            head = new_node;
            tail.next = head;
            System.out.println("Inserted successfully....");
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
            new_node.next = head;
            tail = head;
            System.out.println("Inserted successfully...");
             link++;
            System.out.println(link + " Exist");
        }
        else
        {
            Node temp = head;
            while(temp.next != head)
            {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = head;
            tail = new_node;
            System.out.println("Inserted suuccessfully...");
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
            System.out.println("Linked List not Exist , so First create it....");
        }
        else if(position == link + 2)
        {
            System.out.println("Only" + link + " Exist");
        }
        else if(position == 1)
        {
            insert_at_beging(val);
        }
        else if(position == link + 1)
        {
            insert_at_end(val);
        }
        else
        {
            Node temp = head;

            for(int i = 2 ;i<position ; i++)
            {
                temp = temp.next;
            }
            new_node.next = temp.next;
            temp.next = new_node;
            System.out.println("Inserted succesfully....");
            link++;
            System.out.println(link + " Exist");
        }
    }




    //delete from beging
    void delete_from_beging()
    {
        if(head == null)
        {
            System.out.println("Linked List Not Exist....");
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
            head = head.next;
            tail.next = head;
            System.out.println("Deleted Sucessfully...");
            link--;
            System.out.println(link + " Exist");
        }
    }



    //delete from end
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
            System.out.println("Deleted Successflly...");
            link--;
            System.out.println(link + " Exist");
        }
        else
        {
            Node temp = head;
            Node ptr = temp.next;

            while(ptr.next != head)
            {
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = head;
            tail = temp;
            System.out.println("Deleted successfully...");
            link--;
            System.out.println(link + " Exist");
        }
        
    }



    //delete from specific position
    void delete_from_spec__pos(int position)
    {
        if(head == null)
        {
            System.out.println("Linked List Not Exist...");
        }
        else if(position == 1)
        {
            delete_from_beging();
        }
        else if(position == link)
        {
            delete_from_end();
        }
        else if(position > link)
        {
            System.out.println("Only " + link + " Exist");
        }
        else
        {
            Node temp = head;
            Node ptr = temp.next;

            for(int i = 2 ; i<position ; i++)
            {
                temp = ptr;
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            System.out.println("deleted successully...");
            link--;
            System.out.println(link + " Exist");
        }
    }


    

    //display 
    void display()
    {
        if(head == null)
        {
            System.out.println("Linked List not Exist...");
        }
        else
        {
            Node temp = head;
            do 
            {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            while(temp != head);

            System.out.println();
        }
    }
}