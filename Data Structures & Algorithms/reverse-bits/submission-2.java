class Solution {
    public int reverseBits(int n) {
        
        int a=0;
        int b=0;

        for (int i=0;i<32;i++){
            a=n&1;
            b=b<<1|a;
           n = n >>> 1;

        }
        
        return b;
    }
}
