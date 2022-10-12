class Solution {
    public void reverseString(char[] s) {
        int ptrf = 0;
        int ptre = s.length-1;
        while(ptrf < ptre){
            char temp = s[ptrf];
            s[ptrf] = s[ptre];
            s[ptre] = temp;
            ptrf += 1;
            ptre -= 1;
        }
    }
}