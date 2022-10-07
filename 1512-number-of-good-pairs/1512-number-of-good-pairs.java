class Solution {
    public int numIdenticalPairs(int[] nums) {
        // nums[i] == nums[j] && i<j
        int count = 0;
        int[] arr = new int[101];
        for(int i=0; i<nums.length; i++){
            arr[nums[i]] += 1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                count += (arr[i] * (arr[i] - 1))/2;
            }
        }
        return count;
    }
}