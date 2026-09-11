class Solution {
    public boolean isPalindrome(String s) {
        String x=s;
        x=x.replaceAll("[^a-zA-Z0-9]", "");
        x=x.toLowerCase();
        int i=0;
        int j=x.length()-1;
        while(i<=j ){
           
            if(x.charAt(i)==x.charAt(j)){
                i++;
                j--;
            }
            else if(x.charAt(i)!=x.charAt(j)){
                return false;
            }
           
        
        }
        return true;
    }
}
