class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length]; 
        for(int i=0; i<image.length; i++){
            for(int j=image[i].length-1; j>=0; j--){
                ans[i][image[i].length-1-j] = image[i][j]; 
            }
        }
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[i].length; j++){
                if(ans[i][j] == 0)
                    ans[i][j] = 1;
                else
                    ans[i][j] = 0;
            }
        }
        return ans;
    }
}