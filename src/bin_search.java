import org.junit.Test;

// 34
public class bin_search {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int left=0;
        int right=nums.length-1;
        int index=-1;

        while(left<=right)
        {
            int mid=(left+right)/2;
            if(nums[mid]==target)
            {
                index=mid;
                break;
            }
            else {
                if(nums[mid]<target)
                {
                    left=mid+1;

                }
                else
                {
                    right=mid-1;
                }

            }
        }
        if(index==-1)
            return res;
        else
        {
            res[0]=index;
            res[1]=index;
            int flag=index;
            while(flag>0 && nums[flag]==nums[index])
            {
                res[0]=flag;
                flag--;
            }
            int flag2=index;
            while(flag2<nums.length && nums[flag2]==nums[index])
            {
                res[1]=flag2;
                flag2++;
            }
        }
        return res;
    }
    @Test
    public void te()
    {
        int[] a={5,7,7,8,8,10};
        searchRange(a,8);

    }
}
