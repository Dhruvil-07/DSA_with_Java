//Array implimentation using array List
//insert , delete and display 

//array list interface is  available in this pakage
import java.util.*;

class Array_using_ArrayList
{

    /* 
     public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<>();

        //add element to the array list 
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        a.add(50);

        System.out.println(1);
    
        //remove element from the array 
        a.remove(1);

        System.out.println(a);

        //get element using index
         int d = a.get(1);
         System.out.println(d);

         //check if element is avaliable or  not
         boolean e = a.contains(10);
         System.out.println(e);


         //clear arrray
         a.clear();


         System.out.println(a);
         

     }
     */

     public static void main(String[] args) {
        
        ///scanner class obj
        Scanner sc = new Scanner(System.in);

        //obj of array class
        Array ar = new Array();

        //welcome commment
        System.out.println("Welcome To Array Programe...");

        //var for value and looping
        int val , position;
        boolean check = true;

        while(check)
        {
            System.out.println();;
            System.out.println("1. Insert....");
            System.out.println("2. Insert at Specific Position...");
            System.out.println("3. Delete...");
            System.out.println("4. Display...");
            System.out.println("5. Exit...");

            //variable  for opration choice
            int choice;
            System.out.println("Enter your Choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                 case 1 : System.out.println("Enter Value :  ");
                          val = sc.nextInt();
                          ar.insert(val);
                          break;

                 case 2 : System.out.println("Enter Value :  ");
                          val = sc.nextInt();
                          System.out.println("Enter Position : ");
                          position = sc.nextInt();;
                          ar.insert_at_spec_pos(position, val);
                          break;

                 case 3 : System.out.println("Enter Position : ");
                          position = sc.nextInt();
                          ar.delete(position);
                          break;

                 case 4 : ar.display();
                          break;

                 case 5 : check = false;
                          break;
                        
                 default : System.out.println("Invalid Choice...");
                           break;
            }
        }


        System.out.println("Array programe end...");

     }
}



//array oprations class
class Array
{
   
    ArrayList<Integer> a;

    Array()
    {
         a = new ArrayList<Integer>();
    }

    //insert 
    void insert(int val)
    {
         a.add(val);
         System.out.println("Inserted Successfully...");
         display();
         return;
    }

    //insert at specific position
    void insert_at_spec_pos(int position , int val)
    {
         //a.set(position,val);
         a.add(position,val);
         System.out.println("Inserted Successfully.....");
         display();
         return;
    }


    //delete 
    void delete(int position)
    {
         a.remove(position);
         System.out.println("Deleted Successfully....");
         display();
         return;
    }

    //display
    void display()
    {
         for(int i = 0 ; i<a.size() ; i++)
         {
             System.out.print(a.get(i) + " ");
         }
         System.out.println();
    }
}