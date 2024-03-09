class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        //List<Integer> ans = new ArrayList<Integer>();
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int mid = i;
            int countUni1 = 0;
            Map<Integer, Integer> map1 = new HashMap<Integer, Integer>();
            for(int j=0; j<=mid; j++){
                if(map1.get(nums[j]) == null){
                    countUni1++;
                    map1.put(nums[j], 1);
                }else{
                    map1.put(nums[j], map1.get(nums[j])+1 );
                }
            }
            //System.out.println("countUni1 : "+countUni1);
            int countUni2 = 0;
            Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
            for(int j=mid+1; j<nums.length; j++){
                if(map2.get(nums[j]) == null){
                    countUni2++;
                    map2.put(nums[j], 1);
                }else{
                    map2.put(nums[j], map2.get(nums[j])+1 );
                }
            }
            //System.out.println("countUni2 : "+countUni2);
            //System.out.println(countUni1 - countUni2);
            ans[i] = countUni1 - countUni2;
        }
        return ans;
    }
}