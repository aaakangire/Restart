import java.util.Arrays;

public class ProductExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];

        int right = 1;
        ans[0] = 1;
        for(int i = 1; i < n; i++){
            ans[i] = ans[i-1]*nums[i-1];
        }

        for(int j = n - 2; j >= 0; j--){
            right = right*nums[j+1];
            ans[j] = ans[j]*right;
        }
        System.gc();
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 1, 8, 2};
        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.toString(productExceptSelf(nums)));
    }
}
