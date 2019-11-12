import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Letter_Combinations_of_a_Phone_Number {

    List<String> list=new ArrayList<>();
    Map<String,String> map=new HashMap<String, String>(){{
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","yuv");
        map.put("9","wxyz");
    }};
    // 0 3 9 27
    public void te(String str,int index)

    {
        list.size();
    }

    public List<String> letterCombinations(String digits) {
        if(digits==null || digits.length()==0) return list;
        for(int i=0;i<digits.length();i++)
        {
            String sb= digits.substring(i,i+1);
            String temp=map.get(sb);


        }

        return list;

    }
}
