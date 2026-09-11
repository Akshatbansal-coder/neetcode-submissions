class Solution {
    public int[] countBits(int n) {
        int ans[]=new int[n+1];
        int i=0;
     
        while(i<=n){
            int x=i;
             int count=0;
         while(x>0){
         if( (x&1)==1){
            count++;
         }
         x=x>>>1;
         }
         ans[i]=count;
         i++;
        }
        return ans;
    }
}
