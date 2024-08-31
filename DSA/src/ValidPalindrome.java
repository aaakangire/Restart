import java.util.Arrays;

public class ValidPalindrome {

    public static boolean checkifPalindrome(String s){
        int start = 0;
        int end = s.length() -1;

        while(start < end){
            char l = s.charAt(start);
            char r = s.charAt(end);
            if(!Character.isLetterOrDigit(l)){
                start++;
            }else if(!Character.isLetter(r)){
                end--;
            } else if(Character.toLowerCase(l) == Character.toLowerCase(r)){
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        String s = "A man, a plan, a canal: Panama";

        boolean result = checkifPalindrome(s);

        System.out.println(result);
    }
}
