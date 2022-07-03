/**
 * @param {number[]} nums
 * @return {number[]}
 */
var smallerNumbersThanCurrent = function(nums) {
    let currArr = [];
    let count = 0;
    for(let i=0; i<nums.length; i++){
        let val = nums[i];
        count = 0;
        for(let j=0; j<nums.length; j++){
            if(val > nums[j]){
                count++;
            }
        }
        console.log(count);
        currArr.push(count);
    }
    return currArr;
};