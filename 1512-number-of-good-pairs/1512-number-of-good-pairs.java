class Solution {
    public int numIdenticalPairs(int[] nums) {
        // nums[i] == nums[j] && i<j
        int count = 0;
        for(int i=0; i<nums.length; i++){
            // int val_1 = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count += 1;
                }
            }
        }
        return count;
    }
}