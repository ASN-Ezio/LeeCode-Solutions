class Solution {
    public int[] twoSum(int[] nums, int target) {
    int i=0;
    int j=0;
    int[] a=new int[2];
    for(;i<nums.length-1;i++){
       for(j=i+1;j<nums.length;j++){
           if(nums[i]+nums[j]==target){
           a[0]=i;a[1]=j;
           }
       } 
    }
    return a;
    }
}