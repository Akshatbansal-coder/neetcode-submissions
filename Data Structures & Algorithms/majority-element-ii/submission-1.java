class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        List <Integer> ans = new ArrayList<>();
        int count =1;

        if(nums.length<3){
            for(int i=0;i<nums.length;i++){
             ans.add(nums[i]);

            }
            return ans;
        }
        for(int i=1;i<nums.length;i++){
         if(nums[i]==nums[i-1]){
            count++;
         if(count>nums.length/3){
            if(ans.contains(nums[i])){
                continue;
            }
            ans.add(nums[i]);
         }
         }
         if(nums[i]!=nums[i-1]){
        
         count =1;
         }
                 }
                 
         return ans;
    }
}