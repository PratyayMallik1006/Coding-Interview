//T:O(n)
//S:O(1)
public class TrappingRainWater_Optimized {
    public static int trap(int[] height) {
        int n = height.length;
        if(n <= 2) return 0;
        int sum = 0;
    
        int left = 0, right = n - 1;
        int leftMax = 0, rightMax = 0;
        while(left < right) {
            if(height[left] <= height[right]) {
                if(height[left] >= leftMax) leftMax = height[left];
                else {
                    sum += leftMax - height[left];
                }
                left++;
            } else {
                if(height[right] >= rightMax) rightMax = height[right];
                else {
                    sum += rightMax - height[right];
                }
                right--;
            }
        }
    
        return sum;
    }
    public static void main(String[] args) {
        int heightsArray[] = new int[]{4,2,0,3,2,5};
        System.out.println((trap(heightsArray)));
        }
}
