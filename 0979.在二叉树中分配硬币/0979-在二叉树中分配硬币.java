class Solution {
    private int ans;

    public int distributeCoins(TreeNode root) {
        dfs(root);
        return ans;
    }

    private int[] dfs(TreeNode node) {
        if (node == null)
            return new int[]{0, 0};
        var left = dfs(node.left);
        var right = dfs(node.right);
        int coins = left[0] + right[0] + node.val; // ����Ӳ�Ҹ���
        int nodes = left[1] + right[1] + 1; // �����ڵ���
        ans += Math.abs(coins - nodes);
        return new int[]{coins, nodes};
    }
}