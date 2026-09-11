class Solution {
    public int majorityElement(int[] nums) {
    Arrays.sort(nums);
    int x=nums[0];
    int count =1;
    for(int i=1;i<nums.length;i++){
        if(nums[i]!=nums[i-1]){
            count =1;
            
            x = nums[i];
        }
        if(nums[i]==nums[i-1]){
            count++;
             x=nums[i];
            if(count>nums.length/2){
                return x;
        }
    }
    }
    return x;
    }
}