import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three__sum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
//      -4 -1 -1 0 1 2
        // -1 -1 2
        int i=0;
        while(i<nums.length-2)
        {
//            System.out.println(i);
            int k=i+1;
            int j=nums.length-1;
            int flag=nums[i];
            if(nums[i]>0)
                return list;
            while (k<j)
            {
                int sum=nums[k]+nums[i]+nums[j];
                System.out.println(sum);
                if(sum==0){
                    List<Integer> list2 = new ArrayList<>();
                    list2.add(nums[i]);
                    list2.add(nums[k]);
                    list2.add(nums[j]);
                    list.add(list2);
//                    break;
//                    System.out.println(k);
                    for(int te=k+1;te<nums.length-1;te++)
                    {
                        if(nums[te]!=nums[k])
                        {
                            k=te;
                            break;
                        }
                        return list;
                    }
//                    j--;
                }
                else  if(sum>0)
                {
                    j--;
                }
                else
                    k++;
            }
            while(i<nums.length && flag==nums[i])
                i++;
        }
        return list;

    }
    @Test
    public void te()
    {
        int[] nums={0,0,0,0};
        threeSum(nums);
    }
}