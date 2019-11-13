// 21
public class Merge_Two_Sorted_Lists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=new ListNode(0);
        ListNode hh=head;
        ListNode cur=null;
        while(l1!=null || l2!=null)
        {
            if(l1!=null && l2!=null)
            {
                if(l1.val<l2.val)
                {
                    hh.next=new ListNode(l1.val);
                    hh=hh.next;
                    l1=l1.next;
                }
                else
                {
                    hh.next=new ListNode(l2.val);
                    hh=hh.next;
                    l2=l2.next;
                }
            }
            else if(l1==null)
            {
                hh.next=l2;
                break;
            }
            else
            {
                hh.next=l1;
                break;
            }

        }

        return head.next;
    }
}
