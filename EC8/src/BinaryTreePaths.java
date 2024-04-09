import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if (root != null) {
            findPaths(root, "", paths);
        }
        return paths;
    }

    private void findPaths(TreeNode node, String path, List<String> paths) {
        if (node == null) {
            return;
        }

        path += Integer.toString(node.val);

        if (node.left == null && node.right == null) {
            paths.add(path);
        } else {
            if (node.left != null) {
                findPaths(node.left, path + "->", paths);
            }
            if (node.right != null) {
                findPaths(node.right, path + "->", paths);
            }
        }
    }
}
