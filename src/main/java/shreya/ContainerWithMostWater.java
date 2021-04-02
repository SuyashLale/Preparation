package shreya;

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(new ContainerWithMostWater().maxArea(height));
    }


    public int maxArea(int[] height) {
        int n = height.length;

        if(n==0){
            return 0;
        }

        int maxArea = 0;
        int i = 0;
        int j = n-1;

        while(i<=j){
            int localMaxArea = Math.min(height[i], height[j]) * (j -i);

            maxArea = Math.max(localMaxArea, maxArea);

            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxArea;


    }
}
