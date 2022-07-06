/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProduct = function(nums) {
    let mul = -1;
    for(let i=0; i<nums.length; i++){
        for(let j=0; j<nums.length; j++){
            if(i !== j){
                if((nums[i]-1)*(nums[j]-1) > mul){
                    mul = (nums[i]-1)*(nums[j]-1);
                }
            }
        }
    }
    return mul;
};