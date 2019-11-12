// 19
// 头节点，尾节点 相差n个位置，当尾节点遍历做最后时，交换
public class Remove_Nth_Node_From_End_of_List {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode h=new ListNode(0);
        h.next=head;
        ListNode tail=h;
        ListNode hh=h;

        for(int i=0;i<n;i++)
        {
            tail=tail.next;
        }
        while (tail.next!=null)
        {
            hh=hh.next;
            tail=tail.next;
        }
        hh.next=hh.next.next;
        return h.next;
    }
}
