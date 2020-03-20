// 14

import org.junit.Test;

public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {

        StringBuilder sb=new StringBuilder();
        if(strs==null || strs.length==0) return "";
        int count =0;

        for (int i=0;i<strs[0].length();i++)
        {
            int j=0;
            while(j<strs.length && count<strs[j].length()  && strs[0].charAt(count) == strs[j].charAt(count))
            {
                j++;
            }
            if(j==strs.length)
            {

                sb.append(strs[0].charAt(count));
                count++;
            }
            else
                return sb.toString();

        }

        return sb.toString();

    }

}
