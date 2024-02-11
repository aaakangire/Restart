class Solution {
    public static int numberOfSteps(int num) {
        return helper(num, 0);
    }

    public static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }

        if (num % 2 == 0) {
            return helper(num / 2, ++count);
        }

        return helper(num - 1, ++count);
    }

    public static void main(String[] args) {
        int k = numberOfSteps(14);
        System.out.println(k);
    }
}