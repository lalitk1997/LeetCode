class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int minMove = 0;
        for(int i=0; i<seats.length; i++){
            if(seats[i] > students[i])
                minMove += (seats[i] - students[i]);
            else
                minMove += (students[i] - seats[i]); 
        }
        return minMove;
    }
}