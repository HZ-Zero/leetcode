import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

// 22 k¶ÔÀ¨ºÅ
public class Generate_Parentheses {
    public void dfs(String str,int left,int right,List<String> res)
    {
        if(left==0 && right==0)
        {
            res.add(str);
            return;
        }
        if(left>0)
        {
            dfs(str+'(',left-1,right,res);

        }
        if(right>0 && left<right)
        {
            dfs(str+')',left,right-1,res);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> list=new ArrayList<>();

        dfs("",n,n,list);
        return  list;
    }
    @Test
    public void te()
    {
        System.out.println(generateParenthesis(3));
    }
}
