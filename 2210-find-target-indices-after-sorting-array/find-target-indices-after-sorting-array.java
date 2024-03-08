class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ansList = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] < target)
                continue;
            else if(nums[i] == target)
                ansList.add(i);
            else
                break;
        }
        return ansList;
    }
}