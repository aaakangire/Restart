public class Palindrome {

    public static void main(String[] args) {
        int num = 1234321;

        System.out.println(reverse(num));
        System.out.printf("%d is a palindrome :- %b", num, isPalin(num));
    }

    static int reverse(int num){
        int sum = 0;

        while(num > 0 ){
            sum = sum * 10 + (num % 10);
            num /= 10;
        }

        return sum;
    }

    static boolean isPalin(int num){
        return num == reverse(num);
    }
}
