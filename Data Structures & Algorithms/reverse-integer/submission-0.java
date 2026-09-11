class Solution {
    public int reverse(int x) {
        
        
        int a=x;
        int b=0;
        long ans=0;
        while(a!=0){
            b=a%10;
            a=(a-b)/10;
            ans=ans*10+b;
        }
        if(ans<(int) Math.pow(-2, 31) || ans>=(int) Math.pow(2, 31)){
            return 0;
        }
        return (int)ans;
    }
}
