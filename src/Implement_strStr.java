import org.junit.Test;

// 28
public class Implement_strStr {
    public int strStr(String haystack, String needle) {

        if(needle==null || needle.length()==0)return 0;
        for(int i=haystack.length()-needle.length();i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                if(i+needle.length()<=haystack.length())
                {
                    int f1=i,f2=0;
                    while(f2<needle.length() && haystack.charAt(f1) == needle.charAt(f2))
                    {

                        f1++;
                        f2++;
                    }
                    if(f2==needle.length())
                    return i;
                }

            }
            i--;
        }
        return -1;
    }
    @Test
    public void te()
    {
        System.out.println(strStr("aaaaaaa","abb"));
    }
}
