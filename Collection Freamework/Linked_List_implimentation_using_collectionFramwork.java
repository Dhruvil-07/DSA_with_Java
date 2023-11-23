import java.util.*;

class Linked_List_implimentation_using_collectionFramwork {
    
    /*public static void main(String[] args) {
         
        LinkedList<Integer> ll = new LinkedList<>();


        //add node
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        System.out.println(ll);

        //get value 
        int d =ll.get(1);
        System.out.println(d);

        //check value  id available or not
        boolean e = ll.contains(40);
        System.out.println(e);
        
        //remove element
        ll.remove();
        System.out.println(ll);

        //remove element using val
        ll.remove(Integer.valueOf(20));
        System.out.println(ll);

        //clear the linked list
        ll.clear();
        System.out.println(ll);
    }
    */


    public static void main(String[] args) {
        
        //obj of scannner
        Scanner sc = new Scanner(System.in);

        //obj of  linked list class
        Linkedlist ll = new Linkedlist();

        //welcome comment 
        System.out.println("Welcome to Linked List Programe...");

        //variable for  val ,position , choice and looping 
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
                         ll.insert(val);
                         break;

                case 2 : System.out.println("Enter Value : ");
                         val = sc.nextInt();
                         ll.insert_at_end(val);
                         break;

                case 3 : System.out.println("Enter Your Position : ");
                         position  = sc.nextInt();
                         System.out.println("Enter Your Value : ");
                         val = sc.nextInt();
                         ll.insert_at_spec_pos(val, position);
                         break;


                case 4 : ll.delete_from_beging();;
                         break;

                case 5 : ll.delete_from_end();
                         break;

                case 6 : System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         ll.delete_from_spec_pos(position);
                         break;


                case 7 : ll.display();
                         break;

                case 8 : check = false;
                         break;

                default :  System.out.println("Invalid Choice....");
            }
        }


    }

}




//Linked List opration class
class Linkedlist
{
     LinkedList<Integer> ll;

     Linkedlist()
     {
         ll = new LinkedList();
     }


     //insert at begining
     void insert(int val)
     {
        ll.addFirst(val);
        System.out.println("Inserted succesfully...");
        display();;
        return;
     }


     //insert at end 
     void insert_at_end(int val)
     {
        ll.addLast(val);
        System.out.println("Inserted Successfully....");
        display();
        return;
     }

     //insert at specific position
     void insert_at_spec_pos(int val , int position)
     {
        ll.add(position, val);
        System.out.println("Inserted Successfully...");
        display();
        return;
     }


     //delete from begining
     void delete_from_beging()
     {
        if(ll.isEmpty())
        {
            System.out.println("Linked List Not Exist...");
        }
        else
        {
            ll.removeFirst();
            System.out.println("Deleted Successfullyy...");
            display();
            return;
        }   
     }


     //delete from end 
     void delete_from_end() 
     {
        if(ll.isEmpty())
        {
            System.out.println("Linked List Not Exist...");
        }
        else
        {
             ll.removeLast();
             System.out.println("Deleted successfully...");
             display();
             return;
        }  
     }


     //delete from spec position
     void delete_from_spec_pos(int position)
     {
         if(ll.isEmpty())
         {
            System.out.println("Linked List Not Exist...");
         }
         else
         {
            ll.remove(position);
            System.out.println( "Deleted Succssfuly...");
            display();
            return;
         }
     }




     ///display
     void display()
     {
        if(ll.size() == 0)
        {
            System.out.println("Linked List Does not Exits");
        }
        else
        {
          for(int i = 0; i<ll.size() ; i++)
            {
                System.out.print(ll.get(i) + " ");
            }
        System.out.println();
        }
      
     }
}
