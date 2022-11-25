class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length; i++){
            nums[i] = (nums[i] * nums[i]);
        }
        Arrays.sort(nums);
        // int i=0;
        // int l=nums.length -1;
        // while(i < l){
        //     int temp = nums[i];
        //     nums[i] = nums[l];
        //     nums[l] = temp;
        //     i += 1;
        //     l -= 1;
        // }
        return nums;
    }
}