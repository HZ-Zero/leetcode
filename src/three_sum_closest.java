
// 16

import java.util.Arrays;

import static java.lang.Math.abs;
public class three_sum_closest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res=nums[0]+nums[1]+nums[2];
        for (int i=0;i<nums.length-2;i++)
        {
            int k=i+1;
            int j=nums.length-1;
            while(k<j)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(abs(sum - target)<abs(res-target))
                {
                    res=sum;
                }
                if(sum-target==0)
                {
                    return 0;

                }
                else if(sum-target>0)
                {
                    j--;
                }
                else
                    k++;
            }
        }
        return  res;

    }
}
//
// [-3,-2,-5,3,-4] -3 {-5,-4,-3,-2,3}
// expected -2
//