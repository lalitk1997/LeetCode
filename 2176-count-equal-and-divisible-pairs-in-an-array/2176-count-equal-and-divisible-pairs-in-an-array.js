/**
 * @param {number[]} nums
 * @param {number} k
 * @return {number}
 */
var countPairs = function(nums, k) {
    let countPair = 0;
    for(let i=0; i<nums.length; i++){
        for(let j=0; j<nums.length; j++){
            if(i !== j){
                if(nums[i] === nums[j]){
                    if((i*j) % k === 0){
                        countPair++;
                    }
                }
            }
        }
    }
    return countPair/2;
};