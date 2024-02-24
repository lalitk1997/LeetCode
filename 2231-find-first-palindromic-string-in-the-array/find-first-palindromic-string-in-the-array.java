class Solution {
    public String firstPalindrome(String[] words) {
        boolean flag = false;
        for(int i=0; i<words.length; i++){
            if(isPalindrome(words[i])){
                return words[i];
            }
        }
        return "";
    }

    public boolean isPalindrome(String str){
        int cap = (str.length()/2);
        int i = 0;
        while(i <= cap){
            if(str.charAt(i) == (str.charAt(str.length()-1-i))){
                i++;
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}