class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        int ans = 0;
        int[] sortArr = new int[points.length];
        for(int i=0; i<points.length; i++){
            sortArr[i] = points[i][0];
        }
        Arrays.sort(sortArr);
        int maxDiff = 0;
        for(int i=sortArr.length-1; i>0; i--){
            if(sortArr[i]-sortArr[i-1] > maxDiff){
                maxDiff = sortArr[i]-sortArr[i-1];
            }
        }
        return maxDiff;
    }
}