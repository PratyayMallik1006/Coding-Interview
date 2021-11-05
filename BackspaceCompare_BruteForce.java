import java.util.Stack;

public class BackspaceCompare_BruteForce {
    private static String buildString(String str){
        Stack<Character> builtString = new Stack<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!='#'){
                builtString.push(str.charAt(i));
            }else{
                if(!builtString.isEmpty()){
                builtString.pop();}
            }
           
        } return builtString.toString();
    }
    public static boolean backspaceCompare(String s, String t) {
        String finalS = buildString(s);
        String finalT = buildString(t);
        
        if(finalS.length() != finalT.length()){
            return false;
        } else{
            for(int i=0;i<finalS.length();i++){
                if(finalS.charAt(i)!=finalT.charAt(i)){
                    return false;
                }
            }
        }
       return true; 
    }

    public static void main(String[] args) {
        String s ="ab#z";
        String t ="az#z";
        System.out.println(backspaceCompare(s,t));
        }
}
