class Solution {
    public int uniquePaths(int m, int n) {
        int[] pre = new int[n];
        int[] cur = new int[n];
        Arrays.fill(pre, 1);
        Arrays.fill(cur,1);
        for (int i = 1; i < m;i++){
            for (int j = 1; j < n; j++){
                cur[j] = cur[j-1] + pre[j];
            }
            pre = cur.clone();
        }
        return pre[n-1]; 
    }
}