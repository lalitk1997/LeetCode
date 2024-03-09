class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length-1];
        if(max % min == 0)
            return min;
        else{
            for(int i=min; i>=2; i--){
                if((min % i == 0) && (max % i == 0))
                    return i;
            }
            return 1;
        }
    }
}