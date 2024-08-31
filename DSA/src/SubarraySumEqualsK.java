import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    public static void main(String[] args) {
        int[] nums = {3, 4, 7, 2, -3, 1, 4, 2};
        int k = 7;

        int count = subarrayCount(nums, k);
        System.out.println(count);
    }

    static int subarrayCount(int[] nums, int k){
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
            int temp = sum - k;
            count += mp.getOrDefault(temp, 0);
            mp.put(sum, mp.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
