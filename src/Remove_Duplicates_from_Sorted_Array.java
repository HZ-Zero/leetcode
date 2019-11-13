
// 26

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {

        if(nums.length==0 || nums==null) return 0;
        Set<Integer> set=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set.add(nums[i]);

        }
        return set.size();
    }
}
