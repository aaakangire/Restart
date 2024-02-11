public class MaxSum2DArray {
    public static void main(String[] args) {
        int[][] accounts = {
                {12, 13, 14},
                {98, 65, 12},
                {1, 45, 3},
                {123, 34, 234}
        };
        System.out.println(rich(accounts));
    }

    static int rich(int[][] acc){
        int total = Integer.MIN_VALUE;
        for(int i = 0; i < acc.length; i++){
            if(sum(acc[i]) > total)
                total = sum(acc[i]);
        }
        return total;
    }

    static int sum(int[] person){
        int money = 0;
        for(int i : person){
            money = money + i;
        }
        return money;
    }
}
