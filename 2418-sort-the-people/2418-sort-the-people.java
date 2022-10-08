class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0; i<names.length; i++){
            for(int j=0; j<names.length; j++){
                if(heights[i] > heights[j]){
                    int temp2 = heights[i];
                    heights[i] = heights[j];
                    heights[j] = temp2;
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(heights));
        return names;
    }
}