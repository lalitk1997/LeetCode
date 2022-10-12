class Solution {
    public String mergeAlternately(String word1, String word2) {
        int ptr1 = 0;
        int ptr2 = 0;
        int ptr3 = 0;
        StringBuilder strb = new StringBuilder();
        while(ptr1 < word1.length() && ptr2 < word2.length()){
            if(ptr3 % 2 == 0){
                strb.append(word1.charAt(ptr1));
                ptr1 += 1;
            }else{
                strb.append(word2.charAt(ptr2));
                ptr2 += 1;
            }
            ptr3 += 1;
        }
        while(ptr1 < word1.length()){
            strb.append(word1.charAt(ptr1));
            ptr1 += 1;
        }
        while(ptr2 < word2.length()){
            strb.append(word2.charAt(ptr2));
            ptr2 += 1; 
        }
        return strb.toString();
    }
}