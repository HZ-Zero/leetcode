import org.junit.Test;

public class Longest_Palindromic_Substring {
    public String longestPalindrome(String s) {
        if(s.length()==0) return s;
        int ll=0;
        int rr=0;
        int res=1;

        for(int i=0;i<s.length();i++)
        {
            int l=i-1;
            int r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {

                if(r-l >res)
                {
                    res=r-l;
                    ll=l;
                    rr=r;

                }
                l--;
                r++;

            }
            l=i;
            r=i+1;
            while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r))
            {

                if(r-l >res)
                {
                    res=r-l;
                    ll=l;
                    rr=r;

                }
                l--;
                r++;

            }


        }
        return s.substring(ll,rr+1);

    }
    @Test
    public void te()
    {
        System.out.println(longestPalindrome("abbaba"));
    }
}
