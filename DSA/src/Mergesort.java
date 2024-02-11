import java.util.Arrays;

public class Mergesort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 4, 12, 5, 6, 9, 18};

        mergesort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void mergesort(int[] arr, int s, int e){
        int m = s + (e - s)/2;

        if(s < e){
            mergesort(arr, s, m);
            mergesort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
    }

    static void merge(int[] arr, int s, int m, int e){

        int l1 = m - s + 1;
        int l2 = e - m;

        int[] temp1 = new int[l1];
        int[] temp2 = new int[l2];

        for(int i = 0; i < l1; i++){
            temp1[i] = arr[s + i];
        }

        for(int i = 0; i < l2; i++){
            temp2[i] = arr[m + 1 + i];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while (i < l1 && j < l2){
            if(temp1[i] <= temp2[j]){
                arr[k] = temp1[i];
                i++;
            } else{
                arr[k] = temp2[j];
                j++;
            }
            k++;
        }

        while(i < l1){
            arr[k] = temp1[i];
            i++;
            k++;
        }

        while(j < l2){
            arr[k] = temp2[j];
            j++;
            k++;
        }

    }
}
