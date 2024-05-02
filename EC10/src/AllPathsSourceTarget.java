import java.util.ArrayList;
import java.util.List;

public class AllPathsSourceTarget {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        currentPath.add(0);
        dfs(graph, 0, currentPath, result);
        return result;
    }

    private void dfs(int[][] graph, int node, List<Integer> currentPath, List<List<Integer>> result) {
        if (node == graph.length - 1) {
            result.add(new ArrayList<>(currentPath));
            return;
        }

        for (int neighbor : graph[node]) {
            currentPath.add(neighbor);
            dfs(graph, neighbor, currentPath, result);
            currentPath.remove(currentPath.size() - 1);
        }
    }
}
