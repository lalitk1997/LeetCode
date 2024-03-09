class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        for(int i=0; i<words.length; i++){
            if(words[i].length() < pref.length())
                continue;
            else{
                String prefix = words[i].substring(0, pref.length());
                //System.out.println(prefix);
                if(prefix.equals(pref))
                    count+=1;
            } 
        }
        return count;
    }
}