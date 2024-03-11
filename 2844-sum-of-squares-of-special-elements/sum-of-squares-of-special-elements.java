class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int tmp = 0;
            if(nums.length % (i+1) == 0){
                tmp = nums[i] * nums[i];
                //System.out.println(nums[i]);
            }
            sum += tmp;
        }
        return sum;
    }
}