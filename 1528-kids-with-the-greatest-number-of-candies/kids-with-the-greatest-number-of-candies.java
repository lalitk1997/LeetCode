class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ansList = new ArrayList<Boolean>();
        for(int i=0; i<candies.length; i++){
            int withExtraCandy = candies[i] + extraCandies;
            boolean flag = false;
            for(int j=0; j<candies.length; j++){
                if(withExtraCandy >= candies[j]){
                    continue;
                }else{
                    flag = true;
                    break;
                }
            }
            ansList.add(!flag);
        }
        return ansList;
    }
}