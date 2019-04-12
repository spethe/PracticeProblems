class RemDupsSortedArray {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=i+1;
        //Trick is to just overwrite the next index with new non-duplicate value
        while(j < nums.length){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
            j++;
        }
        return i+1;
    }
}
