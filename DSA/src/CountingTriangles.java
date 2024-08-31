import java.util.Arrays;
import java.util.Scanner;

public class CountingTriangles {

    static int SIZE = 1000001;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] points = new int[n][2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 2; j++){
                points[i][j] = sc.nextInt();
            }
        }

        display(points, n);
        int result = countTriangles(points, n);
        System.out.println(result);
    }

    static void display(int[][] points, int n){
        System.out.print('[');
        for(int i = 0; i < n; i++){
            System.out.print('[');
            for(int j = 0; j < 2; j++){
                System.out.print(points[i][j]);
                if(j == 0)
                    System.out.print(',');
            }
            if(i != n -1)
                System.out.print("],");
        }
        System.out.print(']');
    }

    static int countTriangles(int[][] points, int n){
        int[] x = new int[SIZE];
        int[] y = new int[SIZE];
        int count = 0;

        Arrays.fill(x, 0);
        Arrays.fill(y, 0);

        for (int[] point : points) {
            x[point[0]] += x[point[0]] + 1;
            y[point[1]] += y[point[1]] + 1;
        }

        for (int j : x) {
            for (int k : y) {
                if (j != 0 || k != 0) {
                    int temp = (j - 1) * (k - 1);
                    count += temp;
                }
            }
        }

        return count;
    }
}
