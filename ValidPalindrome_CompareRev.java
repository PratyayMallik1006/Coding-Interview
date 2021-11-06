public class ValidPalindrome_CompareRev {
    public static boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev="";
        char ch;
        for (int i=s.length()-1; i>=0; i--)
      {
        ch= s.charAt(i); 
        rev= rev+ch; 
      }
        if(s.compareTo(rev)!=0) return false;
        return true;
        }
        public static void main(String[] args) {
            System.out.println(isPalindrome("race car"));
        }
}
