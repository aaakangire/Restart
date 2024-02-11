public class Minimum {
    public static void main(String[] args) {
        int[] arr = {23, 34, 90, -9 , -4};

        System.out.println(min(arr));
    }

    static int min(int[] arr){
        if(arr.length == 0)
            return 0;

        int minimum = arr[0];
        for(int n : arr ){
            if(n < minimum)
                minimum = n;
        }
        return minimum;
    }
}
