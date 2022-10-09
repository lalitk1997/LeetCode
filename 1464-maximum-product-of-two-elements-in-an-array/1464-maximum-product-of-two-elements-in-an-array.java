class Solution {
    public int maxProduct(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            int temp = 0;
            for(int j=0; j<nums.length; j++){
                if(i != j){
                    temp = (nums[i] - 1) * (nums[j] - 1);
                }
                if(max < temp){
                max = temp;
                }
            }
        }
        return max;
    }
}