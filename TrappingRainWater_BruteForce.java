//T:O(n^2)
//S:O(1)
public class TrappingRainWater_BruteForce {
    public static int trap(int[] height) {
        int n = height.length;
        if(n <= 2) return 0;
        int totalWater = 0;
        for(int i = 0; i < n; i++) {
            int leftP = i,rightP=i, maxLeft = Integer.MIN_VALUE, maxRight = Integer.MIN_VALUE;
            while(leftP >= 0) {
                maxLeft = Math.max(maxLeft, height[leftP]);
                leftP--;
            }
            leftP = i;
            while(rightP < n) {
                maxRight = Math.max(maxRight, height[rightP]);
                rightP++;
            }
            totalWater += Math.min(maxLeft, maxRight) - height[i];
        }
    
        return totalWater;
    }
    public static void main(String[] args) {
        int heightsArray[] = new int[]{4,2,0,3,2,5};
        System.out.println((trap(heightsArray)));
        }
    
}
