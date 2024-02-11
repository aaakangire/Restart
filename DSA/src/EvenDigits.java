public class EvenDigits {
    public static void main(String[] args) {
        int[] arr = {23, 345, 564, 23, 4567, 654398};
        System.out.println(evenDigits(arr));
        System.out.println((int)Math.log10(987) + 1);
    }

    static int evenDigits(int[] arr){
        if(arr.length == 0)
            return -1;

        int numbers = 0;
        for(int i : arr){
            int digit = 0;
            while (i > 0){
                digit += 1;
                i = i/10;
            }
            if(digit % 2 == 0)
                numbers += 1;
        }
        return numbers;
    }
}
