class Solution {
    public boolean digitCount(String num) {

        int[] numsArr = new int[10];

        for(int i=0; i<num.length(); i++){
            int idx = Integer.valueOf(num.charAt(i)) - '0';
            numsArr[idx]++;
        }
        // System.out.println(Arrays.toString(numsArr));
        // return false;
        for(int i=0; i<num.length(); i++){
            int numTemp = i;
            if(numsArr[numTemp] != (Integer.valueOf(num.charAt(i)) - '0')){
                return false;
            }
        }
        return true;

        /*
        // Un-optimized
        int[] intArr = new int[num.length()];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = Integer.valueOf(num.charAt(i)) - 48;
        }
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
        **/
    }
}