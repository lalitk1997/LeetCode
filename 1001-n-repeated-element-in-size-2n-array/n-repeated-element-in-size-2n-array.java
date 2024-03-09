class Solution {
    public int repeatedNTimes(int[] nums) {
        int rep = nums.length/2;
        Map<Integer, Integer> countNum = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length; i++){
            if(countNum.get(nums[i]) == null ){
                countNum.put(nums[i], 1);
            }else{
                countNum.put(nums[i], (countNum.get(nums[i])+1));
            }
        }
        for(Map.Entry<Integer, Integer> entry : countNum.entrySet()){
            //System.out.println("key : ")
            if(entry.getValue() == rep){
                return entry.getKey();
            }
        }
        return 0;
    }
}