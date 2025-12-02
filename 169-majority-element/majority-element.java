class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i]))
                map.put(nums[i], (map.get(nums[i]) + 1) );
            else
                map.put(nums[i], 1);
        }

        for(Map.Entry <Integer, Integer> entry : map.entrySet() ) {
            int key = entry.getKey();
            int value = entry.getValue();
            if(value > (nums.length/2)){
                return key;
            }
        }
        return 0;
    }
}