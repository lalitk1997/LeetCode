class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            boolean flag = false;
            for(int j=i; j<prices.length; j++){
                if((j > i) && (prices[j] <= prices[i])){
                    flag = true;
                    //System.out.println(prices[i]+" "+prices[j]);
                    ans[i] = prices[i] - prices[j];
                    break;
                }
            }
            if(!flag)
                ans[i] = prices[i];
        }
        return ans;
    }
}