class Solution {
    public int percentageLetter(String s, char letter) {
        int len = s.length();
        int countLetter = 0;
        for(int i=0; i<len; i++){
            if(s.charAt(i) == letter){
                countLetter += 1;
            }
        }
        // System.out.println(countLetter);
        // System.out.println(len);
        return ((countLetter*100) / len);
    }
}