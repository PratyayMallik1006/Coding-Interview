// T:O(n^2)
//S: O(1)

import java.util.Arrays;

class TwoSum_BruteForce{
    public static int[] twoSum(int[] nums, int target) {
        int indices[] = new int[2];

		for(int i=0; i<nums.length; i++) {
			int numToFind = target-nums[i];
            //System.out.println(numToFind);
			for (int j=i+1; j<nums.length; j++) {
                //System.out.println("i: "+i+" j: "+j);
				if (numToFind == nums[j]) {
					indices[0]=i;
					indices[1]=j;
                    return indices;
				}
			}
		}

		return null;
    }
    public static void main(String[] args) {
    int numsArray[] = new int[]{1,3,7,9,2};
    int target = 11;
    System.out.println(Arrays.toString(twoSum(numsArray, target)));
    }

}