class Solution {
    int mx = 0;
    String ans;
    private void palindrome(String s,int i,int j){
        while(i >=0 && j < s.length() && s.charAt(i) == s.charAt(j)){
            if(mx < j - i + 1){
                mx = j - i + 1;
                ans = s.substring(i,i+mx);
            }
            i--;
            j++;
        }
    }
    public String longestPalindrome(String s) {
        for(int i=0;i<s.length();i++){
            palindrome(s,i,i);
            palindrome(s,i,i+1);
        }
        return ans;
    }
}