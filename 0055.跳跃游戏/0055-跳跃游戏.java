class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = 0;
        while (r < n-1) {
            int bound = l + nums[l]; 
            r = Math.max(r, bound);
            if (l == r) {
                break;
            }
            l++;
        }
        return r >= n-1;
    }
}