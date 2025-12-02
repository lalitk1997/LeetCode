class Solution {
    public void moveZeroes(int[] nums) {
        // Solution using an extra array
        int ans[] = new int[nums.length];
        int countZero = 0;
        int idx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                countZero++;
            }else{
                ans[idx] = nums[i];
                idx++;
            }
        }
        for(int i=idx; i<ans.length; i++){
            ans[idx] = 0;
        }
        for(int i=0; i<ans.length; i++){
            nums[i] = ans[i];
        }
    }
}