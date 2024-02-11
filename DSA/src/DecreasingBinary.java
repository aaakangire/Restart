public class DecreasingBinary {
    public static void main(String[] args) {
        int[] arr = {90, 23, 21, 13, 6, 3, 2, 0, -3, -9, -13};
        int target = -13;

        System.out.println(search(arr, target));
    }

    static int search(int[] arr, int target){
        int s = 0;
        int e = arr.length - 1;

        while(s <= e){
            int mid = s + (e - s)/2;

            if(arr[mid] == target){
                return mid;
            }

            if(arr[mid] > target){
                s = mid + 1;
            }else{
                e = mid - 1;
            }
        }
        return  -1;
    }
}
