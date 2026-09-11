class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int i=0;
        while(i<n+1){
        ans[i]=Integer.bitCount(i++);
        }
        return ans;
    }
}
