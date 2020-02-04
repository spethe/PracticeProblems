class StockMarketDanC {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        //Get the differences in stock prices everyday
        int[] diff = getDiffPrices(prices);
        int low = 0;
        int high = diff.length -1;
        //Find MAX Sum Sub-array in difference array to get max profit
        int mf = findMF(diff,low,high);
        if(mf<0){
            mf=0;
        }
        return mf;
    }
    
    private int findMF(int[]diff,int low,int high){
        //Base Case
        if(low == high){
            return diff[low];
        }else{
            int mid = (int) Math.ceil((low+high)/2);
            int leftProfit = findMF(diff,low,mid);
            int rightProfit = findMF(diff,mid+1,high);
            int crossProfit = findCrossMF(diff,low,mid,high);
            if(leftProfit >= rightProfit && leftProfit >= crossProfit) {
                return leftProfit;
            } else if(rightProfit >= leftProfit && rightProfit >= crossProfit) {
                return rightProfit;
            } else{
                return crossProfit;
            }
        }
    }
    
    private int findCrossMF(int[] diff,int low,int mid,int high){
        int leftSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=mid;i>=low;i--){
            sum+=diff[i];
            if(sum > leftSum){
                leftSum = sum;
            }
        }
        int rightSum = Integer.MIN_VALUE;
        sum = 0;
        for(int i=mid+1;i<=high;i++){
            sum+=diff[i];
            if(sum > rightSum){
                rightSum = sum;
            }
        }
        return (leftSum + rightSum);
    }
    
    private int[] getDiffPrices(int[] prices){
        int dlen = prices.length -1;
        int[] diff = new int[dlen];
        for(int i=0; i< dlen; i++){
            int d = prices[i+1] - prices[i];
            diff[i]=d;
        }
        return diff;
    }
}
