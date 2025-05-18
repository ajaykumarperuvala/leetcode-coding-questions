package Arrays;
import java.util.List;
import java.util.ArrayList;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
        if (remain < 0) return; // exceed target sum, no need to continue
        else if (remain == 0) result.add(new ArrayList<>(tempList)); // found a combination
        else {
            for (int i = start; i < candidates.length; i++) {
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, remain - candidates[i], i); // not i + 1 because we can reuse the same elements
                tempList.remove(tempList.size() - 1);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum(candidates, target);
        System.out.println(result);
    }
}