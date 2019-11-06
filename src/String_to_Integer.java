import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//8
public class String_to_Integer {
    public int myAtoi(String str){
        if(str.equals(""))
            return 0;
        Queue<Integer> q=new LinkedList<>();
        int flag=1;
        int i=0;
        while(i<str.length() && str.charAt(i)==' ')
        {
            i++;
        }
        if(i<str.length()) {

            if (str.charAt(i) == '-') {

                flag = -1;
                i++;
                if (i == str.length())
                    return 0;
            } else if (str.charAt(i) == '+') {

                flag = 1;
                i++;
                if (i == str.length())
                    return 0;
            }
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return 0;
            }

            while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                if (q.isEmpty() && str.charAt(i) == '0') {
                    i++;
                    continue;
                }
                q.add(str.charAt(i) - '0');
                i++;
            }

        }

    long res=0;
    if(q.size()>10)
    {
        return flag==1?Integer.MAX_VALUE:Integer.MIN_VALUE;

    }
    while (!q.isEmpty())
    {
        res=res*10+q.poll();
    }

    if(res>Integer.MAX_VALUE)
    {
        return Integer.MAX_VALUE;
    }
    if(res<Integer.MIN_VALUE)
        return Integer.MIN_VALUE;
    return (int) (flag*res);
    }
//    return 0;

    @Test
    public void te()
    {
        System.out.println(myAtoi("0000000000012345678"));
    }
}
