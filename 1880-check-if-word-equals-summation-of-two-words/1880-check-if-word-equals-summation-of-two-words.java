class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        StringBuffer sumFirst = new StringBuffer();
        for(int i=0; i<firstWord.length(); i++){
            sumFirst.append((int)firstWord.charAt(i) - (int)'a');
        }
        // System.out.println(Integer.parseInt(sumFirst.toString()));
        
        StringBuffer sumSecond = new StringBuffer();
        for(int i=0; i<secondWord.length(); i++){
            sumSecond.append((int)secondWord.charAt(i) - (int)'a');
        }
        // System.out.println(Integer.parseInt(sumSecond.toString()));
        
        StringBuffer sumTarget = new StringBuffer();
        for(int i=0; i<targetWord.length(); i++){
            sumTarget.append((int)targetWord.charAt(i) - (int)'a');
        }
        // System.out.println(Integer.parseInt(sumTarget.toString()));
        
        if( Integer.parseInt(sumFirst.toString()) + Integer.parseInt(sumSecond.toString())
          == Integer.parseInt(sumTarget.toString())){
            return true;
        }
        return false;
    }
}