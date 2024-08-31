import java.util.*;

public class BrickWall {
    public static void main(String[] args) {
        List<List<Integer>> brickWall = new ArrayList<List<Integer>>();
//        wall = [[1,2,2,1],[3,1,2],[1,3,2],[2,4],[3,1,2],[1,3,1,1]]
        brickWall.add(Arrays.asList(1,2,2,1));
        brickWall.add(Arrays.asList(3,1,2));
        brickWall.add(Arrays.asList(1,3,2));
        brickWall.add(Arrays.asList(2,4));
        brickWall.add(Arrays.asList(3,1,2));
        brickWall.add(Arrays.asList(1,3,1,1));

        int minimumBricks = leastBricks(brickWall);
        System.out.println(minimumBricks);
    }

    public static int leastBricks(List<List<Integer>> brickWall){
        Map<Integer, Integer> mp = new HashMap<>();
        int gapCounts = 0;

        for (List<Integer> integers : brickWall) {
            int total = 0;
            for (int j = 0; j < integers.size() - 1; j++) {
                total += integers.get(j);
                mp.put(total, mp.getOrDefault(total, 0) + 1);
                gapCounts = Math.max(gapCounts, mp.get(total));
            }
        }

       return brickWall.size() - gapCounts;
    }
}
