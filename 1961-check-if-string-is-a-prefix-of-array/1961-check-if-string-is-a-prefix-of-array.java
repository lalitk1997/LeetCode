class Solution {
    public boolean isPrefixString(String s, String[] words) {
        StringBuilder strb = new StringBuilder();
        for(int i=0; i<words.length; i++){
            strb.append(words[i]);
            if((strb.toString()).equals(s)){
                return true;
            }
        }
        return false;
    }
}