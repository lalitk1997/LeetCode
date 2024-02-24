class Solution {
    public int differenceOfSum(int[] nums) {
        int sumNum = 0;
        int sumDigit = 0;
        for(int i=0; i<nums.length; i++){
            sumNum += nums[i];
            sumDigit += sumDigitFunc(nums[i]);
            System.out.println(sumDigitFunc(nums[i]));
        }
        System.out.println(sumNum);
        System.out.println(sumDigit);
        return Math.abs(sumNum - sumDigit);
    }

    public int sumDigitFunc(int digit){
        int sum = 0;
        while(digit > 0){
            int temp = digit % 10;
            digit = digit / 10;
            sum += temp;
        }
        return sum;
    }
}