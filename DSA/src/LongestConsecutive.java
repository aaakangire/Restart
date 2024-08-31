import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {-8,-4,9,9,4,6,1,-4,-1,6,8};

        int result = maxlength(arr);

        System.out.println(result);
        HashSet<Integer> set = new HashSet<>();

    }

    static int maxlength(int[] nums){

        int n = nums.length;
        //Hashmap
        HashMap<Integer, Boolean> map = new HashMap<>();

        //enter values in hashmap
        for(int i = 0; i < n; i++){
            if(!map.containsKey(nums[i])){
                if(!map.containsKey(nums[i] - 1)){
                    if(map.containsKey(nums[i] + 1) && map.get(nums[i] + 1)){
                        map.put(nums[i] + 1, false);
                    }
                    map.put(nums[i], true);
                } else {
                    if(map.containsKey(nums[i] + 1) && map.get(nums[i] + 1)){
                        map.put(nums[i] + 1, false);
                    }
                    map.put(nums[i], false);
                }
            }
        }

        //create arraylist with distinct key values
        //ArrayList<Integer> list = new ArrayList<>(map.keySet());
        List<Integer> list2 = map.keySet().stream().filter(num -> map.get(num) == true).collect(Collectors.toList());
        System.out.println(list2);

        //maxLength and startPoint
        int maxLength = Integer.MIN_VALUE;
        int startPoint = 0;

        //Iterarte over arraylist if key value is true get the count anms start point
//        for(int val : list){
//            if(map.get(val) == true){
//                int start = val;
//                int count = 0;
//                while(map.containsKey(start + count)){
//                    count++;
//                }
//
//                if(count - 1  > maxLength){
//                    maxLength = count;
//                    startPoint = val;
//                }
//            }
//        }

        for(int val : list2){
                int start = val;
                int count = 0;
                while(map.containsKey(start + count)){
                    count++;
                }

                if(count  > maxLength){
                    maxLength = count;
                    startPoint = val;
                }

        }
        System.out.println(startPoint);
        return maxLength;
    }
}
