public class IncreasingBST {
    private TreeNode prev = null, newRoot = null;
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) return null;
        increasingBST(root.left);

        if (prev != null) {
            root.left = null;
            prev.right = root;
        }
        if (newRoot == null) newRoot = root;
        prev = root;

        increasingBST(root.right);
        return newRoot;
    }
}
