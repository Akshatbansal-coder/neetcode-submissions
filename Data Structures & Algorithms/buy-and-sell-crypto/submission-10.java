class Solution {
    public int maxProfit(int[] prices) {
        int temp=0;
        for(int i=0;i<prices.length;i++){
            for(int j=i;j<prices.length;j++){
                if(prices[j]-prices[i]>0){
             int diff = prices[j]-prices[i];
             
             if(diff>temp){
                temp =diff;
             }
                }
                continue;
            }
        }
        return temp;
    }
}
