// 9

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Number {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;
        if(x<10)
            return true;

        List<Integer> lt=new ArrayList<>();
        while(x/10>0)
        {
            lt.add(x%10);
            x=x/10;
        }
        lt.add(x);
        int i=0;
        int j=lt.size()-1;
        while(lt.get(i)==lt.get(j) && i<j)
        {
            i++;
            j--;
        }
        if(i==j || i>j)
        return true;
        else
            return false;

    }
    @Test
    public void te()
    {
        System.out.println(isPalindrome(121));
    }
}
