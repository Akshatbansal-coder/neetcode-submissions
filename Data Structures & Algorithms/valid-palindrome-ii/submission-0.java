class Solution {



    public static boolean valid(String s, int g , int h){
          while(g<h){
          
            if(s.charAt(g)==s.charAt(h)){
                g++;
                h--;
            }
            else{
                return false;
            }

    }
    return true;
    }
    public boolean validPalindrome(String s) {
        

        
    int a=0;
    int b = s.length()-1;
        while(a<b){

            if(!Character.isLetterOrDigit(s.charAt(a))){
                a++;

                continue;
            }

            if(!Character.isLetterOrDigit(s.charAt(b))){
                b--;

                continue;
            }
            if(s.charAt(a)==s.charAt(b)){
                a++;
                b--;
            }

            else{
                return valid(s,a,b-1)||valid(s,a+1,b);
            }
        }

        return true;
    }
}