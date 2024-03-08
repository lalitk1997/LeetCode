class Solution {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int countStudent = 0;
        for(int i=0; i<startTime.length; i++){
            if(startTime[i] <= queryTime && endTime[i] >= queryTime){
                countStudent += 1;
            }
        }
        return countStudent;
    }
}