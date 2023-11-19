//Singly Linked List implimentation
//insert , delete and display opation


import java.util.Scanner;

//main class for  menu driven programe 
class SinglyLLSturcture
{
    public static void main(String[] args) {
        
        //obj for scanner class
        Scanner sc= new Scanner(System.in);

        //onject of singlyll class
        SinglyLL sll = new SinglyLL();

        //welcome commen
        System.out.println("Welcome to Singly Linked List Programe");

        //var for val , position , choice , and looping
        int val , position , choice;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Insert At Begining...");
            System.out.println("2. Insert At End...");
            System.out.println("3. Insert At Specific Position...");
            System.out.println("4. Delete At Begining...");
            System.out.println("5. Delete At End...");
            System.out.println("6. Delete At Specific Position...");
            System.out.println("7. Display...");
            System.out.println("8.Exit");

            //get choice from user
            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Enter value : ");
                         val = sc.nextInt();
                         sll.insert_at_begining(val);
                         break;

                case 2 : System.out.println("Enter Value : ");
                         val = sc.nextInt();
                         sll.insert_at_end(val);
                         break;

                case 3 : System.out.println("Enter Your Position : ");
                         position  = sc.nextInt();
                         System.out.println("Enter Your Value : ");
                         val = sc.nextInt();
                         sll.insert_at_position(val, position);
                         break;


                case 4 : sll.delete_at_begining();
                         break;

                case 5 : sll.delete_at_end();
                         break;

                case 6 : System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         sll.delete_at_position(position);
                         break;


                case 7 : sll.display();
                         break;

                case 8 : check = false;
                         break;

                default :  System.out.println("Invalid Choice....");
            }
        }


    }
}




//singly linked list programe
class SinglyLL
{

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

    //intially head is null
    Node head = null;



    //insert at beinning
    void insert_at_begining(int val)
    {
        //create node
        Node new_node = new Node(val);

        //add node
        if(head == null)
        {
            head = new_node;
            System.out.println("first node");
        }
        else
        {
            new_node.next = head;
            head = new_node;
            System.out.println("another node");
        }
        
    }



    //insert at end 
    void insert_at_end(int val)
    {
        //create node
        Node new_node = new Node(val);

        if(head == null)
        {
            head = new_node;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = new_node;
        }

    }



    //insert at specific position
    void insert_at_position(int val , int position)
    {
        //create new node
        Node new_node = new Node(val);

        //add node to specific position
        if(position == 1)
        {
            insert_at_begining(val);
        }
        else
        { 
            //assign first node address
            Node temp = head;

            for(int i = 2 ; i<position ; i++)
            {
                temp = temp.next;
            }

            new_node.next = temp.next;
            temp.next = new_node;
        }
    }



    //delete at begining
    void delete_at_begining()
    {
        if(head == null)
        {
        System.out.println("Linked List is not Exist");
        }
        else
        {
            Node temp = head;
            temp = temp.next;
            head = temp;
            System.out.println("Deleted Sucessfully...");
        }
    }



    //delete at end
    void delete_at_end()
    {
        Node temp = head;
        Node ptr = temp.next;

        while(ptr.next != null)
        {
            temp = ptr;
            ptr = ptr.next;
        }
        temp.next = null;
        System.out.println("Deleted sucessfully....");
    }



    //delete at specific location
    void delete_at_position(int position)
    {
        if(head == null)
        {
            System.out.println("Linked List is not Exist...");
        }
        else if(position == 1)
        {
            delete_at_begining();
        }
        else
        {
            Node temp = head;
            Node ptr = temp.next;

            for(int i  = 2 ; i<position ; i++)
            {
                temp = ptr;
                ptr = ptr.next;
            }

            temp.next = ptr.next;

            System.out.println("Deleted successfully...");
       }
            
    }




    //travel
    void display()
    {
        Node temp = head;

        if(temp == null)
        {
            System.out.println("Linked List is EMPTY....");
        }
        else
        {
            while(temp != null)
            {
                System.out.print(temp.val + " ");
                temp = temp.next;
            }
            System.out.println();
            
        }
    }


}