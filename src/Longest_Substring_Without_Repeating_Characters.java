
// 3 最长不重复子串

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        StringBuffer sb= new StringBuffer(s);
        char[] c=s.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        HashSet<Character> set=new HashSet<>();
        int[] flag=new int[s.length()+1];
        int i=0;
        int left=0,right=0;
        int max=0;
        while (i<s.length()){
            if(i==0)
            {
                map.put(c[i],0);
                flag[0]=1;
                i++;
                continue;
            }
            if(!map.containsKey(c[i]))
            {
                map.put(c[i],i);
                flag[i]=flag[i-1]+1;
            }
            else
            {

               int gap=i- map.get(c[i]);
//                System.out.println(gap);
               if(gap>flag[i-1])
               {
                   flag[i]=flag[i-1]+1;
               }
               else
               {
                   flag[i]=gap;
               }
                map.put(c[i],i);
            }
            i++;

        }

        for (i=0;i<s.length();i++)
        {
            System.out.print(flag[i]);
            if(max<flag[i])
            {
                max=flag[i];
                right=i;
            }
        }
        return max;
    }
    @Test
    public void te()
    {
        System.out.println(lengthOfLongestSubstring("aab"));
    }
}
