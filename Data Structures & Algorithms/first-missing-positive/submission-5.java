class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count =0;
          for(int i=0;i<nums.length;i++){
            if(nums[i]==count+1&&nums[i]>0){
              count=count+1;
              // continue;
            }
          
        }
        if(count<=0){
          return 1;
        }
        return count+1;
    }
}