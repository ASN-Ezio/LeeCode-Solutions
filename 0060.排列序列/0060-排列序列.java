class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            ans.add(i);
        }
        int[] fact = new int[n];
        fact[0] = 1;
        for (int i = 1; i < n; i++) {
            fact[i] = i * fact[i - 1];
        }
        k = k - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = n; i > 0; i--) {
            int index = k / fact[i - 1];
            k = k % fact[i - 1];
            sb.append(ans.get(index));
            ans.remove(index);
        }
        return sb.toString();
    }
}