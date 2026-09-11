class Solution {
    public void rotate(int[] nums, int k) {
        for(int j=0;j<k;j++){
        for(int i=nums.length-1;i>0;i--){
        int temp=nums[i-1];
         nums[i-1]=nums[i];
        nums[i]=temp;
        }
        }

    }
}