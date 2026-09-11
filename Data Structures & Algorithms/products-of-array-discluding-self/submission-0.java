class Solution {
    public static int product(int[] nums,int j){
        int x=1;
        for(int i=0;i<nums.length;i++){
            if(i!=j){
            x=nums[i]*x;
            }
            
        }return x;
    }
    public int[] productExceptSelf(int[] nums) {
        int x =1;
        int [] output =new int[nums.length];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                output[i]=product(nums,i);
            }
        }
        return output;
     }
}  
