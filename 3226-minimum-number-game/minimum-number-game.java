class Solution {
    public int[] numberGame(int[] nums) {
        // int[] ans = new int[nums.length];
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
            i++;
        }
        return nums; 
    }
}