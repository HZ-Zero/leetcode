import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// 20
public class Valid_Parentheses {
    public boolean isValid(String s) {
        Map<Character,Character> map=new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');

        Stack<Character> st=new Stack<>();
        int i=0;
        while (i<s.length())
        {
            if (st.empty())
            {
                st.push(s.charAt(i));
            }
            else
            {
                if( (st.peek()=='(' || st.peek()=='[' || st.peek()=='{') && map.get(st.peek())==s.charAt(i))
                    st.pop();
                else
                    st.push(s.charAt(i));
            }
            i++;
        }
        if (st.empty())
            return true;
        else
        return false;
    }
}
