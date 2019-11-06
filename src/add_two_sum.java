import org.junit.Test;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class add_two_sum {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode n1=l1;
        ListNode n2=l2;
        ListNode res=head;
        // ListNode res=head;
        int carry =0;
        int flag=1;
        while(n1 !=null || n2 != null)
        {
            int x=(n1==null)?0:n1.val;
            int y=(n2==null)?0:n2.val;
            int sum=x+y+carry;
            carry=sum/10;
            res.next=new ListNode(sum % 10);
            res=res.next;

            // res.next=new ListNode(sum % 10);
            // res=res.next;
            if(n1!=null)
                n1=n1.next;
            if(n2!=null)
                n2=n2.next;

        }
        if(carry > 0)
        {
            res.next=new ListNode(carry);
        }
        return head.next;
    }
    }

     class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }

//    @Test
//    public void te()
//    {
//        ListNode l1=new ListNode(2);
//        l1.next=new ListNode(4);
//        l1.next=new ListNode(3);
//
//        ListNode l2=new ListNode(5);
//        l2.next=new ListNode(6);
//        l2.next=new ListNode(4);
//        ListNode l3=addTwoNumbers(l1,l2);
//        while (l3.next!=null)
//            System.out.println(l3.val);
//    }
}