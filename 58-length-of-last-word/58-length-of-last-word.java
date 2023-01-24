class Solution {
    public int lengthOfLastWord(String s) {
        boolean flag = true;
        int count = 0;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i) == ' ' && flag == true){
                flag = true;
                continue;
            }else if(s.charAt(i) != ' '){
                flag = false;
                count++;
            }else if(s.charAt(i) == ' ' && !flag){
                break;
            }
        }
        return count;
    }
}