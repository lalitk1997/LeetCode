class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0; i<arr.length; i++){
            if(map.get(arr[i]) == null)
                map.put(arr[i], 1);
            else
                map.put(arr[i], map.get(arr[i])+1 );
        }
        // List<Integer> listele = new ArrayList<Integer>();
        // List<Integer> listrep = new ArrayList<Integer>();
        Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            // listrep.add(Integer.valueOf(entry.getValue()));
            // listele.add(Integer.valueOf(entry.getKey()));
            if(map2.get(entry.getValue()) == null)
                map2.put(entry.getValue(), 1);
            else
                return false;
        }
        return true;
    }
    
}