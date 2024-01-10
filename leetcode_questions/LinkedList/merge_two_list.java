class Solution 
{
    public static void main(String[] args) 
    {
        linked_list ll = new linked_list();
        ll.create_linked_list();
        ListNode final_node = ll.mergeTwoLists(ll.head1,ll.head2);

        System.out.println(final_node.data);
    }

}


class ListNode
{
            int data;
            ListNode next;

            ListNode(int data)
            {
                this.data = data;
                this.next = null;
            }
}

class linked_list
{
          ListNode head1 = null;
          ListNode head2 = null;

        void create_linked_list()
        {
          
            //create first linked list
            head1 = new ListNode(1);
            head1.next = new ListNode(2);
            head1.next.next = new ListNode(4);


            //create secondlinked list
            head2 = new ListNode(1);
            head2.next = new ListNode(3);
            head2.next.next = new ListNode(4);
        }



        //merge two linked list
   ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode temp3 = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;

        while(temp1 != null && temp2 != null)
        {
            if(temp1.data > temp2.data)
            {
                if(temp3 == null)
                {
                    temp3 = temp1;
                    temp1 = temp1.next;
                }
                else
                {
                    while(temp3.next != null)
                    {
                        temp3 = temp3.next;
                    }
                    temp3 = temp1;
                    temp1 = temp1.next;
                }
            }
            else
            {
                if(temp3 == null)
                {
                    temp3 = temp2;
                    temp2 = temp2.next;
                }
                else
                {
                    while(temp3.next != null)
                    {
                        temp3 = temp3.next;
                    }
                    temp3 = temp2;
                    temp2 = temp2.next;
                }
            }
        }

        return temp3;
    }
}