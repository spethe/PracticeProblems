/*
Rotate an array (nums) , k times.
Time complexity: O(n)
Space complexity: O(2n)
Sample testcase: 
Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/

class RotateArray {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] newarr=new int[n];
        for(int i=0;i<n;i++){
            int nind = i+k;
            if(nind >= n){
                nind=nind%n;
            }
            newarr[nind]=nums[i];
        }
        for(int i=0;i<n;i++){
            nums[i]=newarr[i];
        }
    }
}