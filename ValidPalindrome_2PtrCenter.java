public class ValidPalindrome_2PtrCenter {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left =(int) Math.floor(s.length()/2);
        int right = left;
        if(s.length()%2==0){
            left--;
        }
        while(left>=0 && right<=s.length()){
            
            if(s.charAt(left) != s.charAt(right)){
                return false;
                
            }
            else{
                left--;
                right++;
            }
        }
        return true;
        }
        public static void main(String[] args) {
            System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
            }
}
