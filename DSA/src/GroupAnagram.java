import java.util.*;

public class GroupAnagram {
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(anagrams(strs));
    }

    static List<List<String>> anagrams(String[] strs){

        HashMap<String, List<String>> mp = new HashMap<>();

        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = String.valueOf(ch);

            if(!mp.containsKey(sorted)){
                mp.put(sorted, new ArrayList<String>());
            }

            mp.get(sorted).add(s);
        }


        return new ArrayList<>(mp.values());
    }
}
