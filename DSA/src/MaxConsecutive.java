import java.util.Arrays;

public class MaxConsecutive {
    public static void main(String[] args) {
        int bottom = 28;
        int top = 50;
        int[] special = {35,48};

        int result = maxConsecutive(bottom, top, special);
        System.out.println(result);
    }

    static int maxConsecutive(int bottom, int top, int[] special){
        Arrays.sort(special);

        int answer = special[0] - bottom;

        for(int i = 1; i < special.length; i++){
            int temp = special[i] - special[i-1] - 1;
            answer = Math.max(answer, temp);
        }

        answer = Math.max(answer, top - special[special.length - 1]);

        return answer;
    }

}
