import org.junit.Test;

// 4
public class Recursive_Approach {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i=0,j=0;
        int len=nums1.length+nums2.length;
        int midf=len/2;
        double median=0;
        double median2=0;
        while (midf>i+j)
        {
            if(i>=nums1.length)
            {
                median=nums1[j];
                j++;
                continue;
            }
            else if(j>=nums2.length)
            {
                median=nums1[i];
                i++;
                continue;
            }
            else if(nums1[i]>nums2[j])
            {

                median=nums1[j];
                j++;
            }
            else if(nums1[i]<nums2[j])
            {

                median=nums1[i];
                i++;
            }

        }
        if(j==nums2.length && i<=nums1.length)
        {
            median2=nums1[i];
        }
        else if(i==nums1.length && j<=nums2.length)
        {
            median2=nums2[j];
        }
        else if(nums1[i]>nums2[j])
        {
            median2=nums2[j];
        }
        else if(nums1[i]<nums2[j])
            median2=nums2[i];

        return (len%2==0)?(median+median2)/2:median2;
    }
    @Test
    public void  te()
    {
        int[] a ={1};
        int[] b={};
        System.out.println(findMedianSortedArrays(a,b));
    }
}
