import java.util.Arrays;

public class InsertionSortRecuursion {

    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 8, 1};
        sort(arr, arr.length -1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int n, int i, int max){
        if(n == 0)
            return;

        if(i > n){
            swap(arr, n, max);
            sort(arr, --n, 0, 0);
        }else {
            if(arr[i] > arr[max]){
                max = i;
            }
            sort(arr, n, ++i, max);
        }
    }

    static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
