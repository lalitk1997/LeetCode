/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var countKDifference = function(nums, k) {
    let countPair = 0;
    for(let i=0; i<nums.length; i++){
        for(let j=0; j<nums.length; j++){
            if(i !== j){
                if(Math.abs(nums[i]- nums[j]) === k){
                    // console.log(nums[i]+":"+nums[j]);
                    countPair +=1;
                }
            }
        }
    }
    return countPair/2;
};