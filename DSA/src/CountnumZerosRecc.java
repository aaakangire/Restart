public class CountnumZerosRecc {
    public static void main(String[] args) {
        int num = 7000;

        System.out.println(countz(num, 0));
    }

    static int countz(int num, int count){
        if(num == 0)
            return count;

        if(num % 10 == 0)
            return countz(num/10, ++count);

        return countz(num/10, count);
    }

}
