class Solution {
    public int maximizeSum(int[] nums, int k) {
        int maxEle = 0;
        for(int i=0; i<nums.length; i++){
            if(maxEle < nums[i])
                maxEle = nums[i];
        }
        System.out.println(maxEle);
        int sumMax = 0;
        for(int i=0; i<k; i++){
            if(i==0)
                maxEle = maxEle + (0);
            else
                maxEle = maxEle + (1);
            sumMax += maxEle;
        }
        return sumMax;
    }
}