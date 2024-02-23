class Solution {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int sumTemp = 0;
        for(int i=0; i<nums.length; i++){
            sumTemp += nums[i];
            sum[i] = sumTemp;
        }
        return sum;
    }
}