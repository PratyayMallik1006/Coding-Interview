//T:O(n)
//S:O(n)
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring_Optimized{
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();

        Map<Character, Integer> map = new HashMap<>();
        int len = 0, left = 0;
        
        for(int right=0; right<s.length(); right++) {
            
            if(map.containsKey(s.charAt(right)))
                left = Math.max(left, map.get(s.charAt(right))+1);

            len = Math.max(len, right-left+1);
            map.put(s.charAt(right),right);
        }
        
        return len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        }
}
