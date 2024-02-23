class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            ans[i] = sum;
            sum += nums[i];
        }
        System.out.println(Arrays.toString(ans));
        int[] ans2 = new int[nums.length];
        int sum2 = 0;
        for(int j=nums.length-1; j>=0; j--){
            ans2[j] = sum2;
            sum2 += nums[j];
        }
        System.out.println(Arrays.toString(ans2));
        for(int i=0; i<nums.length; i++){
            int temp = 0;
            if(ans[i] - ans2[i] >= 0)
                temp = ans[i] - ans2[i];
            else
                temp = ans2[i] - ans[i];
            nums[i] = temp;
        }
        return nums;
    }
}