class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int numlen = nums.length;
        if(numlen == 0) return 0;
        int low = 0;
        int high = numlen-1;
        int ind = binSearch(low,high,target,nums);
        if(ind < 0) ind=0;
        if(ind > (numlen -1)) ind = numlen;
        return ind;
    }
    //Tweaked Binary Search
    private int binSearch(int low, int high,int target,int[] nums){
           
        if(low>=high){
            if(nums[low] < target && nums[high] > target) return low +1;
            if(nums[low] > target) return low;
            if(nums[high] < target) return high+1;
        }
        int mid = (int)Math.floor((low+high) /2);
        if(nums[mid] == target)
            return mid;
        if(nums[mid] > target)
            return binSearch(low,mid-1,target,nums);
        if(nums[mid] < target)
            return binSearch(mid+1,high,target,nums);
        return 0;
    }
}
