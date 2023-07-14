class Solution {
    boolean[] vis;

    public List<List<Integer>> permuteUnique(int[] nums) {
        int n = nums.length;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> seq = new ArrayList<>();
        Arrays.sort(nums);
        vis = new boolean[n];
        dfs(nums, res, seq, 0);
        return res;
    }

    public void dfs(int[] nums, List<List<Integer>> res, List<Integer> seq, int idx) {
        if (idx == nums.length) {
            res.add(new ArrayList<>(seq));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (vis[i] || (i > 0 && nums[i - 1] == nums[i] && !vis[i - 1])) continue;
            seq.add(nums[i]);
            vis[i] = true;
            dfs(nums, res, seq, idx+1);
            vis[i] = false;
            seq.remove(seq.size()-1);
        }
    }
}