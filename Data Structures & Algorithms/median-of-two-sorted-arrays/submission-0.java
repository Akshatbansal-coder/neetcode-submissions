class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];

        for(int i=0;i<ans.length;i++){
            if(i<nums1.length){
            ans[i]=nums1[i];
            }
            else{
                ans[i]=nums2[i-nums1.length];
            }
        }
        Arrays.sort(ans);

        if(ans.length%2!=0){
            return ans[ans.length/2];
        }

        else{
         return ((double) ans[ans.length / 2] + ans[(ans.length / 2) - 1]) / 2;

        }
    }
}
