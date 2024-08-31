public class Pattern {
    public static void main(String[] args) {
        pattern1(5);

        pattern5(5);

        pattern6(5);

        System.out.println();

        pattern8(5);

        System.out.println();

        pattern12(5);

        pattern11(5);
    }

    static void pattern1(int n){
        for(int r = 0; r < n; r++){
            for(int c = 0; c < r + 1; c++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    static void pattern11(int n){
        for(int r = 0; r<n; r++) {
            for(int c = 0; c < r+1; c++){
                System.out.print((r+c+1) %2);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int r = 0; r < 2*n; r++){
            int coloumns = r > n ? 2*n - r : r;
            for(int c = 0; c < coloumns; c++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    static void pattern6(int n){
        for(int r = 0; r < n; r++){
            int coloumns = r + 1;

            for(int s = 0; s < n - coloumns; s++){
                System.out.print(" ");
            }

            for(int c = 0; c < coloumns; c++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern8(int n){
        for(int r = 0; r < n; r++){
            int coloums = 2*r + 1;

            for(int s = 0; s < n - r; s++){
                System.out.print(" ");
            }

            for(int c = 0; c < coloums; c ++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int r = 0; r < 2*n; r++){
            int coulumns = r < n ? n - r : r - n + 1;

            for(int s = 0; s < n - coulumns; s++){
                System.out.print(" ");
            }

            for(int c = 0; c < coulumns; c++){
                System.out.print("* ");
            }


            System.out.println();
        }
    }

    static void pattern33(int n){
        
    }
}
