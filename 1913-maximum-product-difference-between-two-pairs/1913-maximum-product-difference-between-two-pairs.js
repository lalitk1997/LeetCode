/**
 * @param {number[]} nums
 * @return {number}
 */
var maxProductDifference = function(nums) {
    let min1 = Infinity;
    let max1 = 0;
    let min2 = Infinity;
    let max2 = 0;
    for(let i=0; i<nums.length; i++){
        if(max1 < nums[i]){
            max1 = nums[i];
        }
        if(min1 > nums[i]){
            min1 = nums[i];
        }
    };
    for(let i=0; i<nums.length; i++){
        if(nums[i] === min1){
            nums[i] = undefined;
            break;
        }
    };
    for(let i=0; i<nums.length; i++){
        if(nums[i] === max1){
            nums[i] = undefined;
            break;
        }
    };
    for(let i=0; i<nums.length; i++){
        if(max2 < nums[i]){
            max2 = nums[i]
        }
        if(min2 > nums[i]){
            min2 = nums[i];
        }
    };
    
    console.log(max1);
    console.log(max2);
    console.log(min1);
    console.log(min2);
    return (max1*max2-min1*min2);
};