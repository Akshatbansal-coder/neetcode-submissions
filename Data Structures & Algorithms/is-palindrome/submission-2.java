class Solution {
    public boolean isPalindrome(String s) {
        int a=0;
        int b =s.length()-1;

        while(a<=b){
            if(!Character.isLetterOrDigit(s.charAt(a))){
                a++;
                continue;
            }
            
            if( !Character.isLetterOrDigit(s.charAt(b))){
                b--;
                continue;
            }


           if(Character.toLowerCase(s.charAt(a)) == Character.toLowerCase(s.charAt(b))){
                a++;
                b--;
            }

            else {
                return false;
            }

        }

        return true;
    }
}
