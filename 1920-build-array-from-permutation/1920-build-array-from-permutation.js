/**
 * @param {number[]} nums
 * @return {number[]}
 */
var buildArray = function(nums) {
    let resultArr = [];
    for(let i=0; i<nums.length; i++){
        resultArr.push(nums[nums[i]]);
    }
    return resultArr;
};