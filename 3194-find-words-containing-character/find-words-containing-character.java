class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> idx = new ArrayList<Integer>();
        for(int i=0; i<words.length; i++){
            boolean flag = false;
            for(int j=0; j<words[i].length(); j++){
                if(words[i].charAt(j) == x){
                    flag = true;
                    break;
                }
            }
            if(flag == true)
                idx.add(i);
        }
        return idx;
    }
}