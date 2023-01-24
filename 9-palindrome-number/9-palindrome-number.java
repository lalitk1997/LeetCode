class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }else if(x > 0){
            int num = 0;
            int xTemp = x;
            while(x > 0){
                int temp = x % 10;
                x = x / 10;
                num = num * 10 + temp;
            }
            // System.out.println(num);
            // System.out.println(x);
            if(xTemp == num){
                return true;
            }else{
                return false;
            }
        }else{
            return true;
        }
    }
}