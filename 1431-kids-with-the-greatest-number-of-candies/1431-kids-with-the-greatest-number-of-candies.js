/**
 * @param {number[]} candies
 * @param {number} extraCandies
 * @return {boolean[]}
 */
var kidsWithCandies = function(candies, extraCandies) {
    let maxCandy = [];
    for(let i=0; i<candies.length; i++){
        let totCandy = candies[i]+extraCandies;
        let flag = true;
        for(let j=0; j<candies.length; j++){
            if(i !== j){
                if(totCandy < candies[j]){
                    flag = false;
                    maxCandy.push(false);
                    break;
                }
            }
        }
        if(flag === true){
            maxCandy.push(true);
        }
    }
    return maxCandy;
};