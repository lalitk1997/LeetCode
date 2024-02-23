class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ansList = new ArrayList<Integer>();
        int ptr = 0;
        while(ptr < index.length){
            //ansArr[index[ptr]] = nums[ptr];
            ansList.add(index[ptr], nums[ptr]);
            ptr++;
        }
        int[] ansArr = new int[index.length];
        for(int i=0; i<ansArr.length; i++){
            ansArr[i] = ansList.get(i);
        }
        return ansArr;
    }
}