import org.junit.Test;

// 33
// 局部有序 返回下标
public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {

        if(nums.length==0 || nums==null ) return-1;
        int left=0,right=nums.length-1;
        int mid;
        while(left<=right)
        {
            mid=(left+right)/2;
            if (nums[mid] == target) {
                return mid;
            }
            //前半部分有序,注意此处用小于等于
            if (nums[left] <= nums[mid]) {
                //target在前半部分
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else {
                if (target <= nums[right] && target > nums[mid]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

        }

        return -1;

    }
    @Test
    public void te()
    {
        int[] a={4,5,6,7,0,1,2};
        System.out.println(search(a,2));
    }
}
