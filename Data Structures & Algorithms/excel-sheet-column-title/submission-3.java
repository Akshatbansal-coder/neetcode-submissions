class Solution {
    public String convertToTitle(int columnNumber) {
        String x="";


        int a=0;
        int g=0;
        int b=columnNumber;
      while(b>0){
        a=b%26;
        if (a == 0) {
    a = 26;
    b--;
}
       x = String.valueOf((char)('A' + a - 1)+x) ;
        b=b/26;
        
        }
        
while(g>0){
     x = String.valueOf((char)('A' + (g % 26) - 1)) + x;
       g=g/26;
       }return x;
    }
}