class Solution {
    public boolean digitCount(String num) {
        int[] intArr = new int[num.length()];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.valueOf(num.charAt(i)) - 48;
        }
        //System.out.println(Arrays.toString(intArr));
        //return false;
        //Arrays.sort(intArr);
        for(int i=0; i<num.length(); i++){
            int tempNum = i;
            int freq = Integer.valueOf(num.charAt(i)) - 48;
            int countFreq = 0;
            for(int j=0; j<num.length(); j++){
                if(intArr[j] == tempNum){
                    countFreq++;
                }
            }
            if(freq == countFreq)
                continue;
            else
                return false;
        }
        return true;
    }
}