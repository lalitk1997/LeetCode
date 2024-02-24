class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> ansList = new ArrayList<String>();
        for(int i=0; i<n; i++){
            if((i+1) % 3 == 0 && (i+1) % 5 == 0){
                ansList.add("FizzBuzz");
                continue;
            }else if((i+1) % 3 == 0){
                ansList.add("Fizz");
                continue;
            }else if((i+1) % 5 == 0){
                ansList.add("Buzz");
                continue;
            }else{
                ansList.add(String.valueOf(i+1));
            }
        }
        return ansList;
    }
}