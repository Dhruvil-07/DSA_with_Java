//Queue implimentation using array
///insert , delete and display opration


import java.util.Scanner;


//main class
class QueueStructure
{
    public static void main(String args[])
    {
        //scanner class object
        Scanner sc = new Scanner(System.in);

        //welcome comment
        System.out.println("Welcome To Queue Progame...");

        //get size of queue from user
        int total_element;
        System.out.println("How many elemnt you want to enter : ");
        total_element = sc.nextInt();

        //object of queue class 
        queue que = new queue(total_element);

        //variable for looping , val and choie
        int val , choice;
        boolean check = true;


        while(check)
        {
            System.out.println();
            System.out.println("1. Insert Element ");
            System.out.println("2. Delete Element ");
            System.out.println("3. Display Queue ");
            System.out.println("4. Exit ");

            //get user choicde
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Enter Value : ");
                         val = sc.nextInt();
                         que.insert(val);
                         break;

                case 2 : que.delete();
                         break;

                case 3 : que.dislpay();
                         break;

                case 4 : check = false;
                         break;
            }

        }

        System.out.println("Queue Programe is Ended...");


    }

}


//class for queue opration
class queue
{
   int[] a;
   int front , rear;
 
   queue(int size)
   {
      a = new int[size];
      front = -1 ;
      rear = -1;
   }


   //insert element
   void insert(int val)
   {
        if(front == a.length-1)
        {
            System.out.println("Queue is FULL...");
            return;
        }
        else if(front == -1)
        {
            rear++;
            front++;
            a[front] = val;
            System.out.println("Inserted successfully....");
            dislpay();
            return;
        }
        else
        {   
            front++;
            a[front] = val;
            System.out.println("Insert Successully...");
            dislpay();
            return;
        }
   }

   //delete element
   void delete()
   {
     if(front == -1 || rear == -1)
     {
        System.out.println("Queue is Empty...");
     }
     else if(rear == front)
     {
        System.out.println("Deleted Succesfully....");
        front = -1;
        rear = -1;
        return;
     }
     else
     {
        rear++;
        System.out.println("Delete Successfully");
        dislpay();
        return;
     }

   }


   //dislpay element
   void dislpay()
   {
      if(rear == -1)
      {
        System.out.println("Queue is Empty...");
      }
      else
      {
        for(int i = rear ; i<=front ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
      }
      return;
   }
}