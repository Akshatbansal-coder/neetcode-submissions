class Solution {
    public double myPow(double x, int n) {
        double ans=1;
        if(n>0){
        for(int i=1;i<=n;i++){
            
             ans = x*ans ;}
        }
             else{
                for(int i=n;i<0;i++){
                ans = ans/x;
             }
             }return ans;
        }
    }