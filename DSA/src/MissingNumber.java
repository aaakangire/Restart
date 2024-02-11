import java.util.Arrays;

public class MissingNumber {

    public static void main(String[] args) {
        int[] nums = {1, 0, 3, 2};
        System.out.println(Arrays.toString(nums));
        System.out.println(findMissing(nums));
    }

    static int findMissing(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if((correct >= 0) && (nums[i] != nums[correct])){
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        for(int start = 0; start < nums.length; start++){
            if(nums[start] == 0){
                return (start+1);
            }
        }
        return 0;
    }

    static void swap(int[] arr, int i, int correct){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
