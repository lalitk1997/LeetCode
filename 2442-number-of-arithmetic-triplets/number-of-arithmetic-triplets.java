class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {

        
        //Brute-Force
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i; j<nums.length; j++){
                for(int k=j; k<nums.length; k++){
                    if(i < j && j < k){
                        if((nums[j] - nums[i] == diff) && (nums[k] - nums[j] == diff))
                            count++;
                    }
                }
            }
        }
        return count;
        
    }
}