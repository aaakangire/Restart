import java.util.Arrays;

public class BinarySearchSorted2D {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 9;

        System.out.println(Arrays.toString(bsearch(arr, target)));
    }

    static int[] bsearch(int[][] arr, int target){
        int rows = arr.length;
        int coloums = arr[0].length;

        if(rows == 1){
            return rowbinary(arr, 0, 0, coloums - 1, target);
        }

        int midcoloumn = coloums/2;
        int rowstart = 0;
        int rowend = rows - 1;

        while (rowstart < (rowend - 1)){
            int midrow = rowstart + (rowend - rowstart)/2;

            if(arr[midrow][midcoloumn] == target){
                return new int[]{midrow, midcoloumn};
            }

            if(arr[midrow][midcoloumn] < target){
                rowstart = midrow;
            } else {
                rowend = midrow;
            }
        }

        // only 2 rows are remaining now

        // check in mid coloumn for those 2 rows

        if(arr[rowstart][midcoloumn] == target){
            return new int[]{rowstart, midcoloumn};
        }

        if(arr[rowstart + 1][midcoloumn] == target){
            return new int[]{rowstart + 1, midcoloumn};
        }

//        now check for rest 4 cases
// first case
        if(arr[rowstart][midcoloumn -1] >= target){
            return rowbinary(arr, rowstart, 0, midcoloumn -1, target);
        }
        // second case
        if(arr[rowstart][midcoloumn + 1] <= target && target <= arr[rowstart][coloums - 1]){
            return rowbinary(arr, rowstart -1, 0, midcoloumn - 1, target);

        }
        // third case
        if(arr[rowstart + 1][midcoloumn - 1 ] >= target){
            return rowbinary(arr, rowstart + 1, 0, midcoloumn - 1, target);
        }
        // fourth case
        else {
            return rowbinary(arr, rowstart + 1, midcoloumn + 1, coloums -1 , target);
        }
    }

    static int[] rowbinary(int[][] arr, int row, int coloumstart, int coloumnend, int target){

        while (coloumstart <= coloumnend){
            int m = coloumstart + (coloumnend - coloumstart)/2;

            if(arr[row][m] == target)
                return new int[]{row, m};

            if(arr[row][m] < target){
                coloumstart = m + 1;
            } else {
                coloumnend = m - 1;
            }
        }

        return new int[]{-1, -1};
    }
}
