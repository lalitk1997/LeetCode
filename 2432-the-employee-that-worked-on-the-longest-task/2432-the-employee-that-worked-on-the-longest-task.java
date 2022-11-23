class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1] - 0;
        int id = logs[0][0];
        for(int i=0; i<logs.length-1; i++){
            int diff = 0;
            diff = logs[i+1][1] - logs[i][1];
            if(max < diff){
                max = diff;
                id = logs[i+1][0];
            }
            if(max == diff && id > logs[i+1][0]){
                id = logs[i+1][0];
            }
        }
        return id;
    }
}