class linked_list_using_recursion 
{
   public static void main(String[] args) 
   {
        //manully insert data into singly linked list 
        sll s = new sll();
        s.insert(10);
        s.insert(20);
        s.insert(30);

        s.display(s.head);

        System.out.println();

        //dispaly linked list list reverse order
        s.reverse_ll(s.head);
   }
}


class sll
{
     static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    //intially head is null
    Node head = null;

    //node creation and insertion
    void insert(int data)
    {
        Node new_node = new Node(data);
        if(head == null)
        {
            head = new_node;
            return;
        }
        else
        {
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }

            //node insert
            temp.next = new_node;
        }
    }



    //display linked list using recuersion
    void display(Node temp)
    {
            if(temp == null)
            {
                return;
            }
            else
            {
                System.out.print(temp.data + " ");
                display(temp.next);
            }
            return;
    }



    //display reverse linked list using recursion
    void reverse_ll(Node temp)
    {
        if(temp == null)
        {
            return;
        }

        reverse_ll(temp.next);
        System.out.print(temp.data + " ");
    }

    
}