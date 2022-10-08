class Solution {
    public String truncateSentence(String s, int k) {
        String[] str = s.split(" ");
        StringBuilder strb = new StringBuilder();
        int i = 0;
        for(i=0; i<k-1; i++){
            strb.append(str[i]+" ");
        }
        strb.append(str[i]);
        return strb.toString();
    }
}