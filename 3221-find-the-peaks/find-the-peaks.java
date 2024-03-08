class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> listPeak = new ArrayList<Integer>();
        for(int i=0; i<mountain.length-2; i++){
            if(mountain[i] < mountain[i+1] && mountain[i+1] > mountain[i+2]){
                listPeak.add(i+1);
            }
        }
        return listPeak;
    }
}