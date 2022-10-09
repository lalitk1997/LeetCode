class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        List<Integer> list = new ArrayList<Integer>(); 
        for(int i=0; i<rectangles.length; i++){
            int minSide = Math.min(rectangles[i][0], rectangles[i][1]);
            list.add(minSide);
        }
        Collections.sort(list);
        Collections.reverse(list);
        int count = 0;
        int val = list.get(0);
        for(int i=0; i<list.size(); i++){
            if(val == list.get(i))
                count += 1;
            else
                break;
        }
        return count;
    }
}