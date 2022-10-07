class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[nums.length];
        int idx = 0;
        for(int i=0; i<ans.length; i++){
            if(i % 2 == 0){
                ans[i] = nums[idx++];
            }
        }
        for(int i=0; i<ans.length; i++){
            if(i % 2 != 0){
                ans[i] = nums[idx++];
            }
        }
        return ans;
    }
}