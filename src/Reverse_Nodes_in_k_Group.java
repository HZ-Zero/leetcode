import java.util.Stack;

// 25
public class Reverse_Nodes_in_k_Group {
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<Integer> st=new Stack<>();
        ListNode h1=head;
        ListNode h2=new ListNode(0);
        h2.next=head;
        while(head!=null)
        {
            st.push(head.val);
            head=head.next;
            if(st.size()==k)
            {
                for(int j=0;j<k;j++)
                {
                    h1.val=st.pop();
                    h1=h1.next;
                }

            }
        }
        return h2.next;

    }
}
