class Solution {
    public int countPrefixes(String[] words, String s) {
        int freq = 0;
        for(int i=0; i<words.length; i++){
            boolean flag = true;
            for(int j=0; j<Math.min(words[i].length(), s.length()); j++){
                if(words[i].charAt(j) != s.charAt(j) || 
                  words[i].length() > s.length()){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(words[i]);
                freq += 1;
            }
        }
        return freq;
    }
}