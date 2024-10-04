public class MostWater
{
    public static int maxArea(int[] height) 
    {
        int l = 0;
        int r = he.length - 1; 
        int maxArea = 0; 
        while (l<r) 
        {
            int currentHeight = Math.min(he[l], he[r]);
            int currentWidth = r-l;
            int currentArea = currentHeight * currentWidth;
            maxArea = Math.max(maxArea, currentArea);
            if (he[l]<he[r]) 
            {
                l++;
            } else {
                r--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) 
    {
        int[] he = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println("Maximum water container area: " + maxArea(he)); 
    }
}
