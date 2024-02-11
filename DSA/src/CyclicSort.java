import java.util.Arrays;
// Use this when Array of size N has distinct elements from 1 to N
public class CyclicSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 1, 4};

        System.out.println(Arrays.toString(arr));

        sort(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr){

        int i = 0;

        while(i < arr.length){
            int correctindex = arr[i] - 1;

            if(arr[i] == arr[correctindex]){
                i++;
            }
            else
                swap(arr, i, correctindex);
        }

    }

    static void swap(int[] arr, int i, int index){
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }

}
