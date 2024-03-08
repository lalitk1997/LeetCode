class Solution {
    public int[] sumZero(int n) {
        int[] arrAns = new int[n];
        if(n % 2 == 0){
            int tmp = n - (n/2);
            for(int i=0; i<n; i++){
                if(tmp == 0)
                    tmp--;
                arrAns[i] = tmp;
                tmp--;
            }
        }else{
            int tmp = (int)(n - Math.floor(n/2) - 1); 
            for(int i=0; i<n; i++){
                arrAns[i] = tmp;
                tmp--;
            }
        }
        return arrAns;
    }
}