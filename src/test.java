import org.junit.Test;

import static jdk.nashorn.internal.objects.NativeMath.max;

public class test {
    public boolean isMatch(String s,String p){
        System.out.println(s==null);
        System.out.println(s.isEmpty());
        if (s == null || p == null) {
            return false;
        }
        boolean[][] dp = new boolean[s.length() + 1][p.length() + 1];
        dp[0][0] = true;//dp[i][j] ��ʾ s ��ǰ i ���Ƿ��ܱ� p ��ǰ j ��ƥ��
        for (int i = 0; i < p.length(); i++) { // here's the p's length, not s's
            if (p.charAt(i) == '*' && dp[0][i - 1]) {
                dp[0][i + 1] = true; // here's y axis should be i+1
            }
        }
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < p.length(); j++) {
                if (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)) {//���������Ԫ�� �����Ƕ���Ԫ��ƥ��
                    dp[i + 1][j + 1] = dp[i][j];
                }
                if (p.charAt(j) == '*') {
                    if (p.charAt(j - 1) != s.charAt(i) && p.charAt(j - 1) != '.') {//���ǰһ��Ԫ�ز�ƥ�� �Ҳ�Ϊ����Ԫ��
                        dp[i + 1][j + 1] = dp[i + 1][j - 1];
                    } else {
                        dp[i + 1][j + 1] = (dp[i + 1][j] || dp[i][j + 1] || dp[i + 1][j - 1]);
                            /*
                            dp[i][j] = dp[i-1][j] // ����ַ�ƥ������
                            or dp[i][j] = dp[i][j-1] // �����ַ�ƥ������
                            or dp[i][j] = dp[i][j-2] // û��ƥ������
                             */

                    }
                }
            }
        }
        return dp[s.length()][p.length()];
    }
    @Test
    public void te()
    {
        System.out.println(isMatch("",".*"));
    }
}
