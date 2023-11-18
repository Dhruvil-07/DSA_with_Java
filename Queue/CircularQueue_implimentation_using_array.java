//circular queue implimentation using array
//insert , delete and  display opration


import java.util.Scanner;


//main queue class
class CircularqueueStructure
{
    public static void main(String arg[])
    {
        //scannner class obj
        Scanner sc = new Scanner(System.in);

        //welcome comment
        System.out.println("Welcome to Circularqueue prrogrme...");

        //get size of queue from user
        int total_element;
        System.out.println("How many element you want to enter : ");
        total_element = sc.nextInt();

        //obj of dqueq class
        Circularqueue cq = new Circularqueue(total_element);

        //var for val , choice and looping
        int val , choice;
        boolean check = true;

        while(check)
        {
            System.out.println();
            System.out.println("1. Insnert Element...");
            System.out.println("2. Delete Element...");
            System.out.println("3. Display Element...");
            System.out.println("4.Exit...");

            //user choice
            System.out.println("Enter yourr choice : ");
            choice = sc.nextInt();

            switch(choice)
            {
                case 1 : System.out.println("Enter Value : ");
                         val = sc.nextInt();
                         cq.insert_element(val);
                         break;

                case 2 : cq.delete_element();
                         break;

                case 3 : cq.display();
                         break;

                case 4 : check = false;
                         break;
            }
        }

    }
}



//Circular Queue class
class Circularqueue
{
    int[] a;
    int front;
    int rear;

    
    Circularqueue(int size)
    {
        a = new int[size];
        front = -1;
        rear = -1;
    }


    //insert element method
    void insert_element(int val)
    {
        if(front == a.length-1 && rear == 0)
        {
            System.out.println("Queue is FULL...");
        }
        else if(rear == front +  1)
        {
            System.out.println("Queue is FULL...");
        }
        else
        {
            if(front == -1)
            {
                front = (front + 1) % a.length;
                rear = 0;
                a[front] = val;
                System.out.println("Inserted successfully....");
                display();
                return;
            }
            else
            {
                front = (front + 1) % a.length;
                a[front] = val;
                System.out.println("Inserted successfully....");
                display();
                return;
            }
        }
    }



    //delete element method
    void delete_element()
    {
        if(rear == -1)
        {
            System.out.println("Queue is EMPTY...");
        }
        else if(rear == front)
        {
            rear = -1;
            front = -1;
            System.out.println("Delete Successfully...");
            display();
            return;
        }
        else
        {
            rear = (rear + 1) % a.length;
            System.out.println("Delete sucessfully...");
            display();
            return;
        }
    }

    

    //display elements method
    void display()
    {
      if(rear  == -1)
      {
        System.out.println("Queue is EMPTY...");
      }
      else if(rear <= front)
      {
        for(int i = rear ; i<=front ; i++)
        {
            System.out.print(a[i] + " ");
        }
      }
      else
      {
        for(int i = rear ; i<a.length ; i++)
        {
            System.out.print(a[i] + " ");
        }

        for(int i = 0 ; i<=front ; i++)
        {
            System.out.print(a[i] + " ");
        }
        System.out.println();
      }

    }




}