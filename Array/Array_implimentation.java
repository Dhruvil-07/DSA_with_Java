//Array implimentation 
// insert , delete , and display oprations
// it is a menu driven programe


import java.util.Scanner;

class ArrayStructure
{
    public static void main(String args[])
    {

        //scanner class object 
        Scanner sc = new Scanner(System.in);

        //Array class object
        Array ar = new Array(5);

        //var for array val which will take from user
        int val;

        //var for postion
        int position;


        //var for take opration which is choosen by user
        int opration;

        //var for while loop
        boolean check = true;


        //welcome comment
        System.out.println("Welcome to Array program....");


        while(check)
        {
            System.out.println();
            System.out.println("1. Insert at conntinues position");
            System.out.println("2. Insert at specific position");
            System.out.println("3. Delete Element");
            System.out.println("4. Display");
            System.out.println("5. Exit");
 
            //take opration input
            System.out.println("Enter Your Chioce : ");
            opration = sc.nextInt();

            switch (opration) {
                case 1: System.out.println("Enter Value : ");
                        val = sc.nextInt();
                        ar.insert_continues(val);
                        break;
            
                case 2 : System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         System.out.println("Enter val : ");
                         val = sc.nextInt();
                         ar.insert_specific_position(position, val);
                        break;

                case 3 : System.out.println("Enter Position : ");
                         position = sc.nextInt();
                         ar.delte_element(position);
                         break;

                case 4 : ar.display();
                        break;
                        
                case 5 : check = false;
                         break;

                default:
                    break;
            }

        }   

        System.out.println("Programe Ended");
    }
}





//array opration class
class Array
{
    int a[];
    int point;

    //constructer for inslization  and memory allocation
    Array(int size)
    {
        a = new int[size];
        point = 0;
    }


    //insert at continues postion
    void insert_continues(int val)
    {
        if(a.length == point)
        {
            System.out.println("Array is FULL");
            return;
        }
        else
        {
            a[point] = val;
            point++;
            System.out.println("Insert successfully....");

            //for didsplay array after insertion 
            display();
            return;
        }
    }


    //insert at any posiotion
    void insert_specific_position(int pos , int val)
    {
         if(a.length == point)
         {
            System.out.println("Array is FULL");
         }
         else if(pos > a.length || pos<0)
         {
            System.out.println("Invalid Position");
            return;
         }
         else
         {
            for(int i = point - 1 ; i>=pos ; i--)
            {
                a[i+1] = a[i];
            }
            a[pos] = val;
            point++;
            System.out.println("Insert Successfully");

            //for display array after insertion
            display();
            return;
         }
    }


    //delete from any positio of array 
    void delte_element(int pos)
    {
        if(point == 0)
        {
            System.out.println("Array is Empty");
            return ;
        }
        else if(pos > a.length || pos<0)
        {
            System.out.println("Enter valid postion...");
            return;
        }
        else
        {
             for(int i = pos ; i<point ; i++)
             {
                a[i] = a[i+1];
             }
              point--;
             System.out.println("Delete Sucessfully");
             
             //for display array after deletion
             display();
             return;
        }

        
    }



    //display array
    void display()
    {
        for(int i = 0 ; i<point ; i++)
        {
            System.out.print(a[i] + " ");
        }

        System.out.println();
    }



}