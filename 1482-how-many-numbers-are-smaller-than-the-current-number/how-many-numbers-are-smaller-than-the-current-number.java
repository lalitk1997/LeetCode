class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i=0; i<temp.length; i++){
            temp[i] = nums[i];
        }
        int[] ans = new int[nums.length];
        Arrays.sort(temp);
        /*
        int idx1 = 0;
        int idx2 = nums.length-1;
        while(idx1 < idx2){
            int tempVar = temp[idx1];
            temp[idx1] = temp[idx2];
            temp[idx2] = tempVar;
            idx1++;
            idx2--;
        }
        */
        System.out.println("Temp");
        System.out.println(Arrays.toString(temp));
        System.out.println("Nums");
        System.out.println(Arrays.toString(nums));
        int count = 0;
        for(int i=0; i<nums.length; i++){
            count = 0;
            for(int j=0; j<nums.length; j++){
                if(nums[i] > temp[j]){
                    count++;
                }else{
                    break;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}