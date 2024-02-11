public class PatternRecurssion {

    public static void main(String[] args) {
        int n = 4;
        pattern1(n, 0);
    }

    static void pattern1(int r, int c){
        if(r == 0){
            return;
        }

        if(r <= c){
            System.out.println();
            pattern1(--r, 0);
        }

        if(r > c){
            System.out.print("*");
            pattern1(r, ++c);
        }

    }
}
