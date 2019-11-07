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
                    // ���P[I]��S[J]�ַ���ͬ ������P[I-1]��S[J-1]��ͬ
                    dp[i+1][j+1]=dp[i][j];
                }
                if(p.charAt(j)=='*')
                {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {
                        //���ǰһ��Ԫ�ز�ƥ�� �Ҳ�Ϊ����Ԫ��
                        dp[i + 1][j + 1] = dp[i+1][j - 1];
                    }
                    // *����0���ַ� ���i��j-2�Ƚ� ��j-1���ַ�������Ϊ��0���� dp[I][J]=dp[i][j-2]
                    // *����һ���ַ� ����j-1�Ƿ��i-1ƥ�� i��j-1�Ƿ�ƥ�䣿��
                    // *�������ַ�
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