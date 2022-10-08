class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                List<Integer> list = new ArrayList<Integer>();
                for(int k=i; k<=j; k++){
                    list.add(arr[k]);
                }
                if(list.size() % 2 == 1){
                    for(int l=0; l<list.size(); l++){
                        count += list.get(l);   
                    }
                }
            }
        }
        return count;
    }
}