import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String str = "Ashutosh";
        char target = 'm';

        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(search(str, target));
        }

        static boolean search(String str, char target){
            if(str.length() == 0)
                return false;

//            for(char i = 0; i < str.length(); i++){
//                if(str.charAt(i) == target)
//                    return true;
//            }

            for(char i : str.toCharArray()){
                if(i == target)
                    return true;
            }

            return false;
        }
    }