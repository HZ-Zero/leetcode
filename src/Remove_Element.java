import java.util.ArrayList;
import java.util.List;

// 27
public class Remove_Element {
    public int removeElement(int[] nums, int val) {

        List<Integer> list=new ArrayList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
                list.add(nums[i]);
            }
        }
        int count=0;
        for(Integer i:list)
        {
            nums[count++]=i;
        }

        return list.size();
    }
}
