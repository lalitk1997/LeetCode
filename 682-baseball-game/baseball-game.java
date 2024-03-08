class Solution {
    public int calPoints(String[] operations) {
        List<Integer> scoreCount = new ArrayList<Integer>();
        for(int i=0; i<operations.length; i++){
            if(operations[i].equals("C")){
                scoreCount.remove(scoreCount.size()-1);
            }else if(operations[i].equals("D")){
                scoreCount.add(scoreCount.get(scoreCount.size()-1) * 2);
            }else if(operations[i].equals("+") ){
                scoreCount.add((scoreCount.get(scoreCount.size()-1)) + (scoreCount.get(scoreCount.size()-2)));
            }else {
                scoreCount.add(Integer.valueOf(operations[i]));
            } 
        }
        int sum = 0;
        for(int i=0; i<scoreCount.size(); i++){
            sum += scoreCount.get(i);
        }
        return sum;
    }
}