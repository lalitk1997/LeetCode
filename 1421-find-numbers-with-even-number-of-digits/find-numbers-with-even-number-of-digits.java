class Solution {
    public int findNumbers(int[] nums) {
        int countEven = 0;
        for(int i=0; i<nums.length; i++){
            String num = String.valueOf(nums[i]);
            if(num.length() % 2 == 0)
                countEven++;
        }
        return countEven;
    }
}