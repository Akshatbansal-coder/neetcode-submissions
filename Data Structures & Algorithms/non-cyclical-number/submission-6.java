class Solution {
    public boolean isHappy(int n) {

        int x = n/1000;
        int y = (n%1000-n%100)/100;
        int z=(n%100-n%10)/10;
        int a=n%10;
        
        int h=x*x + y*y +z*z +a*a;
        if((h/10)>=1){
            return isHappy(h);
        }
        if(h ==1){
         
            return true;
        } 

        
        return false;
        }
}