// 26

import org.junit.Test;

public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {

        if(nums.length==0 || nums==null) return 0;
        int p=0;
        int q=1;
        while(q < nums.length){
            if(nums[p] != nums[q]){
                nums[p + 1] = nums[q];
                p++;
            }
            q++;
        }
        return p+1;
    }
    @Test
    public void te()
    {
        int[] s={0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(s));
        for(int i=0;i<s.length;i++)
        {
            System.out.println(s[i]);
        }
    }
}
