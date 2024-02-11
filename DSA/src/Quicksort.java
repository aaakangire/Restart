import java.util.Arrays;

public class Quicksort {
    public static void main(String[] args) {
        int[] arr = {4, 6, 2, 5, 7, 9, 1, 3};

        quick(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void quick(int[] arr, int l, int h){
        if(l < h){
            int partition = correctPostion(arr, l, h);

            quick(arr, l, partition - 1);
            quick(arr, partition + 1, h);
        }
    }

    static int correctPostion(int[] arr, int l, int h){
        int pivot = arr[l];
        int i = l;
        int j = h;

        while(i < j){
            while (arr[i] <= pivot && i <= h)
                i++;

            while (arr[j] > pivot && j >= l)
                j--;

            if(i < j){
                swap(arr, i, j);
            }
        }
        swap(arr, l, j);

        return j;
    }

    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
