class Solution {
    public int findDuplicate(int[] nums) {
        int ans[]=new int[nums.length-1];


        for(int i=0;i<ans.length;i++){
            ans[i]=1;
        }


        for(int i=0;i<nums.length;i++){
           int x=nums[i]-1;
         ans[x]--;
        }

        for(int i=0;i<ans.length;i++){
            if(ans[i]<0){
                return i+1;
                
            }
            continue;
        }
        return -1;
    }
}
