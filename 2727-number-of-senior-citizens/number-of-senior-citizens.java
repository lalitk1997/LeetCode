class Solution {
    public int countSeniors(String[] details) {
        int count = 0;
        for(int i=0; i<details.length; i++){
            String ageStr = details[i].substring(11, 13);
            //System.out.println(ageStr);
            if(Integer.valueOf(ageStr) > 60)
                count++;
        }
        return count;
    }
}