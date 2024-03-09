class Solution {
    public int heightChecker(int[] heights) {
        int[] tmp = new int[heights.length];
        for(int i=0; i<heights.length; i++){
            tmp[i] = heights[i];
        }
        Arrays.sort(tmp);
        int count = 0;
        for(int i=0; i<heights.length; i++){
            if(tmp[i] != heights[i])
                count++;
        }
        return count;
    }
}