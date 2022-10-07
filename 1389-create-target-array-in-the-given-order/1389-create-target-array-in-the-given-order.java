class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<Integer>();
        int[] ans = new int[index.length];
        for(int i=0; i<index.length; i++){
            // ans[index[i]] = nums[i];
            list.add(index[i],nums[i]);
        }
        for(int i=0; i<ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}