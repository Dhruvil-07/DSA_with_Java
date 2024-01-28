/*
 203. Remove Linked List Elements.

 -> Given the head of a linked list and an integer val, remove all the nodes of
    the linked list that has Node.val == val, and return the new head.

Example 1:
Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]

Example 2:
Input: head = [], val = 1
Output: []

Example 3:
Input: head = [7,7,7,7], val = 7
Output: []
 */

class remove_element_from_ll 
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

    public static ListNode removeElements(ListNode head, int val) 
    {
        if(head == null)
        {
            return null;
        }
        else
        {
            ListNode Final_head = head;

            while (Final_head.val == val) 
            {
               Final_head = Final_head.next;    
            }

            ListNode temp = head;
            ListNode ptr = head.next;

            while (ptr != null) 
            {
                if(ptr.val == val)    
                {
                    temp.next = ptr.next;
                    ptr = ptr.next;
                }
                else
                {
                    temp = ptr;
                    ptr = ptr.next;
                }
            }
            return Final_head;
        }
    }   

    public static void main(String[] args) 
    {
        ListNode head;
        head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = removeElements(head, 6);
        
        while (result != null) 
        {
            System.out.print(result.val + " ");    
            result =result.next;
        }

    }


}
