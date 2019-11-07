import org.junit.Test;

// 11
public class Container_With_Most_Water {

    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int maxw=(j-i)*min(height[j],height[i]);
        while(i<j)
        {
            int v1=(j-i)*min(height[j],height[i]);
            if(height[j]<height[i])
            {
                j--;
            }
            else
                i++;
            if(v1>maxw)
                maxw=v1;
        }

        return  maxw;

    }
    public static int min(int x,int y)
    {
        return x>y?y:x;
    }
    @Test
    public void te()
    {
        int[] x={1,3,2,5,25,24,5};
        System.out.println(maxArea(x));
    }
}
