import java.util.Arrays;

public class BinarySearch2D {
//    matrix is sorted row wise and coloumn wise
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int target = 40;

        System.out.println(Arrays.toString(bsearch(arr, target)));
    }

    static int[] bsearch(int[][] arr, int target){
        int r = 0;
        int c = arr[0].length - 1;

        if(arr.length == 0){
            return  new int[]{-1, -1};
        }

        while (r <= arr.length - 1 && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            }

            if(arr[r][c] > target){
                c--;
            } else {
                r++;
            }
        }
        return new int[]{-1, -1};
    }
}
