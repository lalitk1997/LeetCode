class Solution {
    public String truncateSentence(String s, int k) {
        String[] strArray = s.split(" ");
        System.out.println(Arrays.toString(strArray));
        StringBuilder strb = new StringBuilder();
        for(int i=0; i<k; i++){
            if(i == k-1){
                strb.append(strArray[i]);
            }else{
                strb.append(strArray[i]+" ");
            }
        }
        System.out.println(strb);
        return (strb.toString());
    }
    
}