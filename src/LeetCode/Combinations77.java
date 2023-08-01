package LeetCode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].

        You may return the answer in any order.

        Example 1:

Input: n = 4, k = 2
Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
Explanation: There are 4 choose 2 = 6 total combinations.
Note that combinations are unordered, i.e., [1,2] and [2,1] are considered to be the same combination.


Example 2:

Input: n = 1, k = 1
Output: [[1]]
Explanation: There is 1 choose 1 = 1 total combination.

        */
public class Combinations77 {


    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int start, int n, int k, List<Integer> path, List<List<Integer>> result) {
        if (path.size() == k) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i <= n; i++) {
            path.add(i);
            backtrack(i + 1, n, k, path, result);
            path.remove(path.size() - 1); // Backtrack by removing the current number from the combination.
        }
    }

    public static void main(String[] args) {
        Combinations77 combinations = new Combinations77();
        int n = 4;
        int k = 2;
        List<List<Integer>> result = combinations.combine(n, k);
        System.out.println(result);
    }


}

