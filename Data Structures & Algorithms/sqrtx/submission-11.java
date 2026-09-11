class Solution {
    public int mySqrt(int x) {
        int low=0;
        int high=x;
         if(x==0){
                return 0;
            }
        while(low<=high){
            int mid=low+(high-low)/2;
            long sq = (long)mid*mid;
            if(sq==x){
                return mid;
            } 
            
            if(sq<x && (long)(mid+1)*(mid+1)>x){
                return mid;
            }
            if(sq<x){
                low=mid+1;
            }
            if(sq>x){
                high = mid-1;
            }

            
              }return 1;
}
}