class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for(int i=0; i<sentences.length; i++){
            int count = 0;
            for(int j=0; j<sentences[i].length(); j++){
                if(sentences[i].charAt(j) == ' '){
                    count += 1;
                }
            }
            if(max < count){
                max = count;
            }
        }
        return (max+1);
    }
}