class LongestMountainArray {
    public int longestMountain(int[] arr) {
        int i=0,ans=0;
        int len = arr.length;
        while(i<len){
            int base=i;
            while(i+1 < len && arr[i]<arr[i+1]){
                i+=1;
            }
            if(i==base){
                i+=1;
                continue;
            }
            int peak=i;
            while(i+1 < len && arr[i]>arr[i+1]){
                i+=1;
            }
            
            if(i==peak){
                i+=1;
                continue;
            }
            ans=Math.max(ans,i-base +1);
        }
        return ans;
    }
}
