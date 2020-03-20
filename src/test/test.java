package test;

import org.junit.Test;

import java.util.List;

public class test {
    public int findindex(int[] arr, int x) {
        int left=0;
        int right=arr.length-1;
        int mid=0;
        while(left<right)
        {
            mid=(left+right)/2;
            if(x<arr[mid])
                right=mid-1;
            else
                left=mid+1;
        }
        return arr[mid];

    }
    public void te(int[] a) {
    a[0]=0;
    }

    @Test
    public void test(){
        int[] a ={2,4,6,8,10,12,14,16};
        te(a);
        System.out.println(a[0]);

    }
}
