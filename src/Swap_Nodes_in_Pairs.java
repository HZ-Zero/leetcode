
// 24
public class Swap_Nodes_in_Pairs {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode h=head;

        while(head!=null && head.next!=null)
        {
            int i=head.val;
            int j=head.next.val;
            head.val=j;
            head.next.val=i;
            head=head.next.next;
        }
        return h;
    }
}
