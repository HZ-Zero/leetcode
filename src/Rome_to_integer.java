import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

// 13
public class Rome_to_integer {
    public int romanToInt(String s) {
        Map<Character,Integer> map=new HashMap<>();
        int[] in={1,5,10,50,100,500,1000};
        Character[] ch={'I','V','X','L','C','D','M'};
        for (int i=0;i<in.length;i++)
        {
            map.put(ch[i],in[i]);
        }
        int j=0;
        int sum=0;
        while(j<s.length())
        {
            if(j+1<s.length() && map.get(s.charAt(j)) < map.get(s.charAt(j+1)))
            {
                sum=sum+map.get(s.charAt(j+1))-map.get(s.charAt(j));
                j=j+2;
            }
            else
            {
                sum = sum + map.get(s.charAt(j));
                j++;
            }
        }
        return sum;

    }
    @Test
    public void te()
    {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
