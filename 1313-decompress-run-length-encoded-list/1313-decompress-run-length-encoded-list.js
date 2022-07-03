/**
 * @param {number[]} nums
 * @return {number[]}
 */
var decompressRLElist = function(nums) {
    let concatArr = [];
    let idx = 0;
    while(idx < nums.length){
        let rep = nums[idx];
        let val = nums[idx+1];
        for(let i=0; i<rep; i++){
            concatArr.push(val);
        }
        idx += 2;
    }
    return concatArr;
};