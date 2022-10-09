class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image[0].length];
        // System.out.println(Arrays.toString(image));
        for(int i=0; i<image.length; i++){
            // for(int j=0; j<image[i].length; j++){  
            for(int j=image[i].length-1; j>=0; j--){
                ans[i][image[i].length-j-1] = image[i][j];
            }
        }
        // System.out.println(Arrays.toString(ans));
        for(int i=0; i<image.length; i++){
            for(int j=0; j<image.length; j++){
                if(ans[i][j] == 0){
                    ans[i][j] = 1;
                }else{
                    ans[i][j] = 0;
                }
            }
        }
        return ans;
    }
}