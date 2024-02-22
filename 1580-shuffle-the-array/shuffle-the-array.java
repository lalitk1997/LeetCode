class Solution {
    public int[] shuffle(int[] nums, int n) {
        int idx1 = 0;
        int idx2 = nums.length/2;
        int[] ans = new int[nums.length];
        int idx = 0;
        while(idx1 < nums.length/2 && idx2 < nums.length && idx < nums.length){
            ans[idx] = nums[idx1];
            idx++;
            idx1++;
            ans[idx] = nums[idx2];
            idx++;
            idx2++;
        }
        return ans;
    }
}