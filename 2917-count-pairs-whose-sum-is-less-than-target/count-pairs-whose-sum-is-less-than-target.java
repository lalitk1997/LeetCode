class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int countPair = 0;
        for(int i=0; i<nums.size(); i++){
            for(int j=i; j<nums.size(); j++){
                if((i < j) && (j < nums.size()) && ((nums.get(i) + nums.get(j)) < target)){
                    countPair += 1;
                }
            }
        }
        return countPair;
    }
}