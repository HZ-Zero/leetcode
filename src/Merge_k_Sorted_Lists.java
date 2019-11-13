import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// 23  PriorityQueue<ListNode> queue  优化队列 first in largest out
public class Merge_k_Sorted_Lists {
    public ListNode mergeKLists(ListNode[] lists) {

//        Arrays.
        ListNode head=new ListNode(0);
        ListNode hh=head;
        List<Integer> l=new ArrayList<>();
        int i=0;
        while (i<lists.length)
        {
            while(lists[i]!=null)
            {
                l.add(lists[i].val);
                lists[i]=lists[i].next;
            }
            i++;
        }
        Collections.sort(l);
        int j=0;
        while(j<l.size())
        {
            int temp=l.get(j);
            head.next=new ListNode(temp);
            head.next=head.next.next;
        }
        return hh.next;
    }
}
