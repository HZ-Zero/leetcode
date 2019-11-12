// 21
public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode hh=head.next;
        while(l1.next!=null || l2.next!=null)
        {
            if(l1!=null && l2!=null)
            {
                if(l1.val<l2.val)
                {
                    hh.next=l1;
                    l1=l1.next;
                }
                else
                {
                    hh.next=l2;
                    l2=l2.next;
                }

            }
            else if(l1==null)
            {
                hh.next=l2;

            }
            else
                hh.next=l1;

        }

        return head.next;

    }
}
