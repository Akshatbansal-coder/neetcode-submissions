class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high = nums.length-1;
        int mid=0;

        while(low<=high){
         mid = low + (high-low)/2;

         if(nums[mid]==target){
            return mid;
         }

         if(mid<nums.length-1 && nums[mid]<target && nums[mid+1]>target){
            return mid+1;
         }

         if(nums[mid]<target){
            low = mid+1;
         }

         if(nums[mid]>target){
            high = mid-1;
         }
        }
        return low;
    }
}