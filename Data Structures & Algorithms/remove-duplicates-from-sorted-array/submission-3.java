class Solution {
    public int removeDuplicates(int[] nums) {
        
   
        int a=0;

        int b=1;

        //counter of unique elements
        int count=0;
        
        while(b<nums.length){
            if(nums[a]==nums[b]){
             b++;
            }

            else {
                a++;
                nums[a]=nums[b];
                count++;
                b++;
            }
        }

        return count+1;
    }
}