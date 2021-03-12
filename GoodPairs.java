/*
Given an array of integers nums.

A pair (i,j) is called good if nums[i] == nums[j] and i < j.

Return the number of good pairs.
*/

class GoodPairs {
    public int numIdenticalPairs(int[] nums) {
        
        int[] countMap = new int[101];
        int result = 0;    
        countMap[nums[0]]++;
        int[] used = new int[101];
        
        for (int i = 1; i < nums.length; ++i) {
            if (countMap[nums[i]] > 0) {
                used[nums[i]]++;
                result += used[nums[i]];
            }
            countMap[nums[i]]++;
        }
        
        return result;
    }
}
