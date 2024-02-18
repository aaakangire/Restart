import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MaxsubString {
    public static void main(String[] args) {
        String s = "aabaab!bb";

        int a = longestSub(s);
        System.out.println(a);
    }

    static int longestSub(String s){
        // Hashmap
        HashMap<Character, Integer> map = new HashMap<>();

        //ans which hold maximum length
        int ans = 0;
        int i = 0;
        int j = 0;

        //two pointers String start and current index. every iteration compare ans and make higher value as answer.
        while(j < s.length()){
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j)) >= i){
                i = map.get(s.charAt(j));
            }

            map.put(s.charAt(j), j + 1);
            int temp = j - i + 1;
            ans = Math.max(temp, ans);
            j++;
        }

        return ans;
    }
}
