import com.sun.org.apache.xerces.internal.xs.StringList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// 6
public class zig_conversion {
    public String convert(String s, int numRows) {
//        char[][] ans=new char[numRows][s.length()/numRows];
//        StringBuilder[] str=new StringBuilder[numRows];
        List<StringBuilder> str=new ArrayList<>();
        for (int i=0;i<numRows;i++)
            str.add(new StringBuilder());
        int i=0;
        while(i<s.length())
        {
            for(int j=0;j<numRows;j++)
            {
                if(i>=s.length())
                    break;
                str.get(j).append(s.charAt(i));
                i++;
            }
            for(int j=numRows-2;j>0;j--)
            {
                if (i>=s.length())
                    break;
                str.get(j).append(s.charAt(i));
                i++;
            }

        }
        String res="";

        for(int k=0;k<numRows;k++) {
//            System.out.println(str.get(k));
            res = res + str.get(k);
        }

        return res;
    }
    @Test
    public void  te()
    {
        System.out.println(convert("PAYPALISHIRING",4));
    }
}
