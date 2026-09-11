class Solution {
    public int hammingWeight(int n) {
        int[] binary = new int[35];
        int id = 0;

        // Number should be positive
        while (n > 0) {
            binary[id++] = n % 2;
            n = n / 2;
    }
    int count=0;
    for(int i=0;i<binary.length;i++){
        if(binary[i]==1){
            count++;
        }
    
    }
    return count;
    }
    }
