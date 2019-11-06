import org.junit.Test;

import java.util.HashMap;

public class twO_sum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] res = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);

        }
        for(int i=0;i<nums.length;i++)
        {
            int r = target - nums[i];
            if(map.containsKey(r)){
                for(int j=i+1;j<nums.length;j++)
                    if(nums[j]==r)
                    {
                    res[0]=i;
                    res[1]=j;
                    }
            }
        }
        return res;
    }
    @Test
    public void test1()
    {
        int[] nums = {3, 3};
        int target = 6;
        System.out.println(twoSum(nums,target)[0]);
        System.out.println(twoSum(nums,target)[1]);


    }


}
