import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 20
public class four_sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        if(nums.length<4) return null;
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<=nums.length-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
                continue;
            for(int j=i+1;j<=nums.length-2;j++)
            {
                if(j>i+1 && nums[j]==nums[j-1])
                continue;
                int k=j+1;
                int l=nums.length-1;
                while (k<l)
                {
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
//                    System.out.println(sum);
                    if(sum==target)
                    {
                        List<Integer> ll=new ArrayList<>();
                        ll.add(nums[i]);
                        ll.add(nums[j]);
                        ll.add(nums[k]);
                        ll.add(nums[l]);
                        list.add(ll);
                        int nn=nums[k];
                        while(k<l && nn==nums[k])
                        {
                            k++;
                        }

                    }
                    else if(sum > target)
                    {
                        l--;

                    }
                    else  if(sum < target)
                    {
                        k++;

                    }
                }


            }
        }
        return list;
    }
    @Test
    public  void te()
    {
        int[] ii={1,0,-1,0,-2,2};
        System.out.println(fourSum(ii,0));
    }
}