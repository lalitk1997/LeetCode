class Solution {
    public int[] buildArray(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            list.add(nums[nums[i]]);
        }
        for(int i=0; i<list.size(); i++){
            nums[i] = list.get(i);
        }
        return nums;
    }
}