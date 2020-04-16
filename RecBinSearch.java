class RecBinSearch {
    public int search(int[] nums, int target) {
        return binSearch(0,nums.length - 1,target,nums);
    }  
    //Recursive approach to binary search
    private int binSearch(int start, int end, int target, int[] nums){
        if(start > end) return -1;
        int mid = Math.round((start+end)/2);
        if( nums[mid] == target) return mid;
        else if(nums[mid] > target){
             return binSearch(start,mid-1, target, nums);
        }
        else{
             return binSearch(mid+1, end, target, nums);
        }
    }
}
