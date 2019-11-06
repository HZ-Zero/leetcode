// 10
public class Regular_Expression_Matching {
    public boolean isMatch(String s, String p) {

        if(s.isEmpty()) return p.isEmpty();

        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for(int i=0;i<p.length();i++)
        {
            if(p.charAt(i) == '*' && dp[0][i-1])
                dp[0][i]=true;
        }

        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<p.length();j++)
            {

            }
        }


        return true;
    }

}
