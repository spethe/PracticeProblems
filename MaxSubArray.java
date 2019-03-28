/*Given an integer array nums, find the contiguous subarray (containing at least one number) 
which has the largest sum and return its sum.*/

class MaxSubArray {
    public int maxSubArray(int[] nums) {
        //2 variables: global sum, local sum
        int lsum=-2147483647;
        int locsum=0;
        //If all the numbers in the array are negative, then the largest sum will be addition of all numbers.
        //Trick is to consider local sum as 0.
        for(int i=0; i<nums.length;i++){
            locsum=locsum+nums[i];
            if(locsum > lsum){
                lsum=locsum;
            }
            if(locsum < 0){
                locsum=0;
            }
        }
        return lsum;
    }
}