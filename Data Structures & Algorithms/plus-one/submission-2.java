class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        int n=digits.length-1;
        digits[n]=digits[n]+1;
        if(digits[n]>=10){
            digits[n]=digits[n]%10;
            carry=1;
        }

        if(carry==1){
            for(int i=n-1;i>=0;i--){
                digits[i]=digits[i]+1;
                if(digits[i]>=10){
                    digits[i]=digits[i]%10;
                    carry=1;
                    continue;
                }
                carry=0;
                break;
                
            }

            if(carry==1){
                int ans[]=new int[digits.length+1];
                ans[0]=1;
                return ans;
            }
        }
        return digits;
    }
}