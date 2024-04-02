public class EvaluateTree {
    public boolean evaluateTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }

        boolean leftValue = evaluateTree(root.left);
        boolean rightValue = evaluateTree(root.right);

        if (root.val == 2) {
            return leftValue || rightValue;
        } else if (root.val == 3) {
            return leftValue && rightValue;
        }

        return false;
    }
}
