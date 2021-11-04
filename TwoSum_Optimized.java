//T:O(n)
//S:O(n)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum_Optimized {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) { 
			
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int numsArray[] = new int[]{1,3,7,9,2};
        int target = 11;
        System.out.println(Arrays.toString(twoSum(numsArray, target)));
        }
    
}
