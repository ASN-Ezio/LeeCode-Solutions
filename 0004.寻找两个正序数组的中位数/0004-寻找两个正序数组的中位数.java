class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
int m=nums1.length;
        int n=nums2.length;
        int len=m+n;
        int i=len/2,ni=0,mi=0,temp=-1,result=-1;
        while (i>=0){
            temp=result;
            if (mi<m&&(ni>=n||nums1[mi]<nums2[ni])) result=nums1[mi++];
            else result=nums2[ni++];
            i--;
        }
        if (len%2!=0) return result;
        else return (temp+result)/2.0;
    }
}