//T:O(n^2)
//S:O(n)
import java.util.HashMap;
import java.util.Map;

public class LongestSubstring_BruteForce {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<=1) return s.length();

        int len = 0;
        
        for(int left=0; left<=s.length(); left++) {
            Map<Character, Integer> map = new HashMap<>();
            
            int currentLength = 0;
                        
            for(int right=left; right<s.length(); right++) {
                if(!map.containsKey(s.charAt(right))) {
                    currentLength++;
                    map.put(s.charAt(right),1);
                }else{
                    break;
                }
            }
            
            if(currentLength > len)
                len = currentLength;
        }
        
        return len;
    }
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        }
}
