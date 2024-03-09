class Solution {
    public int findNonMinOrMax(int[] nums) {
        int max = -1;
        int min = 999;
        for(int i=0; i<nums.length; i++){
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }
        //System.out.println("Max : "+max);
        //System.out.println("Min : "+min);
        if(nums.length > 2){
            for(int i=0; i<nums.length; i++){
                if(nums[i] < max && nums[i] > min){
                    return nums[i];
                }
            }
            return -1;
        }else{
            return -1;
        }

        /*
        // Time complexity O(nlogn) Space Complexity Logn
        if(nums.length > 2){
            Arrays.sort(nums);
            return nums[1];
        }else{
            return -1;
        }
        */
    }
}