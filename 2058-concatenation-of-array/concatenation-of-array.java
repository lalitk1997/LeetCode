class Solution {
    public int[] getConcatenation(int[] nums) {
        int ansSize = nums.length * 2;
        int[] ans = new int[ansSize];
        int idx = 0;
        for(int i = 0; i < nums.length; i++){
                ans[i] = nums[i];
                idx++;
            }
        for(int i = idx; i < ansSize; i++){
            ans[i] = nums[i-nums.length];
        }
        return ans;
    }
}