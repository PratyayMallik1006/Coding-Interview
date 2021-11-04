//T:O(n)
//S:O(1)

public class ContainerWithMostWater_Optimized {
    public static int maxArea(int[] height) {     
        int left = 0;
        int right = height.length - 1;
        
        int maxWater = 0;
        
        while(left < right){
            int leftWall = height[left];
            int rightWall = height[right];
            
            int minHeight = Math.min(leftWall,rightWall);
            int depth = right - left;
            
            maxWater = Math.max(maxWater, minHeight*depth);
            
            
            if(leftWall < rightWall){
                left++;
            }else{
                right--;
            }
            
        }
        
        return maxWater;
    }
    public static void main(String[] args) {
        int heightsArray[] = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println((maxArea(heightsArray)));
        }
    
}
