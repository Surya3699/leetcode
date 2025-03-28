// 3 Given an array, we have to find the running sum of the 1d array
class Solution {
    public int[] runningSum(int[] nums) {
        for (int i=1; i<nums.length; i++) {
            nums[i] = nums[i] + nums[i-1];
        }
        return nums;
    }
}
