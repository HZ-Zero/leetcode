import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.junit.Test;

// 10
public class Regular_Expression_Matching {
    public boolean isMatch(String s, String p) {

        if(s.isEmpty()) return p.isEmpty();

        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[0][0]=true;
        for(int i=0;i<p.length();i++)
        {
            if(p.charAt(i) == '*' && dp[0][i-1])
                dp[0][i+1]=true;
        }

        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<p.length();j++)
            {
                if(s.charAt(i)==p.charAt(j) || p.charAt(j)=='.')
                {
                    // 如果P[I]与S[J]字符相同 则结果与P[I-1]和S[J-1]相同
                    dp[i+1][j+1]=dp[i][j];
                }
                if(p.charAt(j)=='*')
                {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        //如果前一个元素不匹配 且不为任意元素
                        dp[i + 1][j + 1] = dp[i+1][j - 1];
                    }
                    // *代表0个字符 结果i与j-2比较 （j-1的字符可以认为是0个） dp[I][J]=dp[i][j-2]
                    // *代表一个字符 就是j-1是否和i-1匹配 i和j-1是否匹配？？
                    // *代表多个字符
                    else
                    dp[i+1][j+1]=dp[i+1][j-1] || dp[i+1][j] || dp[i][j+1];
                }

            }
        }


        return dp[s.length()][p.length()];
    }
    @Test
    public void te()
    {
        System.out.println(isMatch("mississippi","mis*is*p*."));
    }

}
//"mississippi"
//"mis*is*p*."
//         for(int i=0;i<=s.length();i++)
//            for (int j=0;j<=p.length();j++)
//            {
//                if(dp[i][j]){
//                    System.out.print(i);
//                    System.out.println(j);
//
//                }
//            }