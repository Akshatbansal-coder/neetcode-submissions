class Solution {
    List<Integer> a = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return a;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null) {
            return;
        }

        if (level == a.size()) {
            a.add(root.val);
        }

        dfs(root.right, level + 1);
        dfs(root.left, level + 1);
    }
}
