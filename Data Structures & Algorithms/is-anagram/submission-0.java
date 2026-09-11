class Solution {
    public boolean isAnagram(String s, String t) {
        char[] x=s.toCharArray();
        Arrays.sort(x);
        char [] z = t.toCharArray();
        Arrays.sort(z);
         s = new String(x);
         t = new String(z);
         if(s.equals(t)){
            return true;
         }
         return false;
     }
}
