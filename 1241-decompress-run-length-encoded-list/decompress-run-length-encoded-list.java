class Solution {
    public int[] decompressRLElist(int[] nums) {
        List<Integer> ans = new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(( (2*i) < nums.length)){
                //int freq = nums[2*i];
                //int val = nums[(2*i)+1];
                for(int j=0; j<nums[2*i]; j++){
                    ans.add(nums[(2*i)+1]);
                }
            }
        }
        int[] ansArr = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            ansArr[i] = ans.get(i);
        }
        return ansArr;
    }
}