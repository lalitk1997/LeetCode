class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPair = 0;

        // UN-OPTIMIZED APPROACH
        /*
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<nums.length; j++){
                if(nums[i] == nums[j] && i < j){
                    goodPair++;
                }
            }
        }
        return goodPair;
        */

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                goodPair+=map.get(nums[i]);
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
                map.put(nums[i],1);
        }
        return goodPair;
    }
}