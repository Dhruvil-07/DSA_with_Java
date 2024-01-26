/*
leat code question no 21.

You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

Exaample 1 :-
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []


Input: list1 = [], list2 = [0]
Output: [0]
 */

 class Solution 
 {
    static class ListNode
    {
        int val;
        ListNode next;

        ListNode(int val)
        {
            this.val = val;
            this.next = null;
        }

    }



    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        ListNode final_head = null;
        ListNode tail = null;

        if(list1 == null && list2 == null)
        {
            final_head = null;
        }
        else if(list1 == null)
        {
            final_head = list2;
        }
        else if(list2 == null)
        {
            final_head = list1;
        }
        else
        {
            //for first node
            if(list1.val < list2.val)
            {
                final_head = list1;
                tail = final_head;
                list1 = list1.next;
            }
            else
            {
                final_head = list2;
                tail = final_head;
                list2 = list2.next;
            }


            //for remaining  node
            while(list1 != null && list2 != null)
            {
                if(list1.val < list2.val)
                {
                    tail.next = list1;
                    tail = tail.next;
                    list1 = list1.next;
                }
                else
                {
                    tail.next  = list2;
                    tail = tail.next;
                    list2 = list2.next;
                }
            }

            //for  remainng node of  one of list
            while(list1 != null)
            {
                tail.next = list1;
                tail = tail.next;
                list1 = list1.next;
            }

            while(list2 != null)
            {
                tail.next = list2;
                tail = tail.next;
                list2 = list2.next;
            }

        }
        return final_head;
    }

    public static void main(String[] args) 
    {
            ListNode head1;

            head1 = new ListNode(1);
            head1.next = new ListNode(2);
            head1.next.next = new ListNode(4);
            

            ListNode head2 = null;

            head2 = new ListNode(1);
            head2.next = new ListNode(2);
            head2.next.next = new ListNode(3);
        

           ListNode final_node = mergeTwoLists(head1 , head2);
           
           while(final_node != null)
           {
                System.out.print(final_node.val + " ");
                final_node = final_node.next;
           }
    }
}