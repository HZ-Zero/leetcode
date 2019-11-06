import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
//import math;

import static java.lang.Math.abs;

// 7
public class Reverse_Integer {
    public int reverse(int x) {
        int x2=abs(x);
        Queue<Integer> q=new LinkedList<Integer>() {
        };
        while(x2%10>0)
        {
            q.add(x2%10);
            x2=x2/10;
        }

        int  res=0;
        while (!q.isEmpty())
        {
            if((res == Integer.MAX_VALUE/10 && q.peek()>Integer.MAX_VALUE%10) || res >Integer.MAX_VALUE/10)
            {
                System.out.println(res);
                System.out.println(Integer.MAX_VALUE/10);

                return 0;

            }
            res =res*10+q.poll();
        }
        if(x<0)
            res=-res;
        return  res;

    }

@Test
    public void te()
{
    System.out.println(reverse(1534236469));
}
}
