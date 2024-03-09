class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(map.get(nums[i]) == null)
                map.put(nums[i], 1);
            else
                map.put(nums[i], map.get(nums[i])+1 );
        }
        int sumUnique = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1)
                sumUnique += entry.getKey();
        }
        return sumUnique;
    }
}