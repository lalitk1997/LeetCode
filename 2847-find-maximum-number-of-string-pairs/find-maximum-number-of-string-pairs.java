class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            StringBuilder strb = new StringBuilder();
            strb.append(words[i]);
            strb.reverse();
            for(int j=i+1; j<words.length; j++){
                //System.out.println(strb+" "+words[j]);
                if(strb.toString().equals(words[j]))
                    count+=1;
            }
        }
        return count;
    }
}