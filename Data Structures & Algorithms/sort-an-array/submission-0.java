class Solution {
        public static void conquer(int[]nums,int si,int mid,int ei){
                int[] merged = new int[ei-si+1];
                int x1=si;
                int x2=mid+1;
                int x=0;
                while(x1<=mid && x2<=ei){
                        if(nums[x1]<nums[x2]){
                        merged[x++]=nums[x1++];
                } else{
                        merged[x++]=nums[x2++];
                }
                }
                while(x1<=mid ){
                        merged[x++]=nums[x1++];
                }while(x2<=ei){
                       
                        merged[x++]=nums[x2++];
                }
                for(int i=0,j=si;i<merged.length;i++,j++){
                        nums[j]=merged[i];
                }
        }
        
        
        public static void sort(int[] nums,int si , int ei){
                if(si>=ei){
                  return;
                }
                int mid = si+(ei-si)/2;
                sort(nums,si,mid);
                sort(nums,mid+1,ei);
                conquer(nums,si,mid,ei);
        }
    public int[] sortArray(int[] nums) {
       int n= nums.length;
       sort(nums,0,n-1);
       return nums;
    }
}