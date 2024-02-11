import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissing {
    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> list = missing(nums);

        System.out.println(list);
    }

    static List<Integer> missing(int[] nums){

        List<Integer> result = new ArrayList<>();
        int index = 0;

        while (index < nums.length) {
            int correct = nums[index] - 1;

            if(nums[index] != nums[correct]){
                swap(nums, index, correct);
            }else index++;
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] != (i + 1)){
                result.add(i + 1);
            }
        }

        return result;
    }

    static void swap(int[] arr, int i, int index){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
