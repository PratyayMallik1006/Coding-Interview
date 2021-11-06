public class ValidPalindrome_2PtrOutside {
    public static boolean isPalindrome(String s) {
        //s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        s=s.toLowerCase();
        int left =0;
        int right = s.length()-1;
        
        while(left<right){
             if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            
            if(s.charAt(left) != s.charAt(right)){
                return false;
                
            }
            else{
                left++;
                right--;
            }
        }
        return true;
        }
        public static void main(String[] args) {
            System.out.println(isPalindrome("A man, a plan, a canal: Panamaff"));
            }
}
