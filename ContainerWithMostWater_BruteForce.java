public class ContainerWithMostWater_BruteForce {
    
        public static int maxArea(int[] height) {
            int max = 0;
            for(int i=0; i<height.length; i++){
                for(int j = i+1; j < height.length; j++){
                    int smallest = height[i]<height[j] ? height[i] : height[j];
                    int area = smallest * (j-i);
    
                    max = Math.max(area, max);
                }
            }
            return max;
        }
    

    public static void main(String[] args) {
        int heightsArray[] = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println((maxArea(heightsArray)));
        }
}
