// 12

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// I, V, X, L, C, D and M.I             1
//V             5
//X             10
//L             50
//C             100
//D             500
//M             1000
//        Map<Integer,StringBuffer> map= new HashMap<>();
//        map.put(1,new StringBuffer("I"));
//        map.put(5,new StringBuffer("I"));
//        map.put(10,new StringBuffer("I"));
//        map.put(50,new StringBuffer("I"));
//        map.put(100,new StringBuffer("I"));
//        map.put(500,new StringBuffer("I"));
//        map.put(1000,new StringBuffer("I"));
public class Integer_to_Roman {
    public String intToRoman(int num) {
        int[] na1={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String[] str={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        StringBuilder str2=new StringBuilder();
        int[] na2=new int[na1.length];
        int i=na1.length-1;
        while(num>0 && i>=0)
        {
            if(num - na1[i]>=0)
            {
//                na2[i]++;
                str2.append(str[i]);
                num=num-na1[i];
            }
            else
                i--;

        }
//        System.out.println(str2.toString());
        return str2.toString();
    }
    @Test
    public  void te()
    {
        intToRoman(1234);
    }

}
