/**
 * @param {number[]} nums
 * @param {number} n
 * @return {number[]}
 */
var shuffle = function(nums, n) {
    let ansArr = [];
    let idx = 0;
    let fptr = 0;
    let eptr = n;
    while(idx < nums.length){
        if(idx % 2 === 0){
            ansArr[idx] = nums[fptr];
            idx++;
            fptr++;
        }else{
            ansArr[idx] = nums[eptr];
            idx++;
            eptr++;
        }
    }
    return ansArr;
};