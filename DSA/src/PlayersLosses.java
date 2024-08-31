import com.sun.source.tree.BreakTree;

import java.util.*;
import java.util.stream.Collectors;

public class PlayersLosses {
    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};

        List<List<Integer>> result = findWinner(matches);
        System.out.println(result);
    }

    public static List<List<Integer>> findWinner(int[][] matches){
        List<List<Integer>> result = new ArrayList<List<Integer>>(2);
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> winners= new ArrayList<>();

        for(int[] match : matches){
            mp.put(match[1], mp.getOrDefault(match[1], 0) + 1);
        }

        for(int[] match: matches){
            if(!mp.containsKey(match[0])){
                if(!winners.contains(match[0])){
                    winners.add(match[0]);
                }
            }
        }

        List<Integer> loss = mp.entrySet().stream().filter(entry -> entry.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
        Collections.sort(winners);
        Collections.sort(loss);
        result.add(winners);
        result.add(loss);
        return result;
    }

}
