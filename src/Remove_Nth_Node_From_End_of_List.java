// 19
// ͷ�ڵ㣬β�ڵ� ���n��λ�ã���β�ڵ���������ʱ������
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
