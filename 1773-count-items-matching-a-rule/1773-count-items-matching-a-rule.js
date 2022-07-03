/**
 * @param {string[][]} items
 * @param {string} ruleKey
 * @param {string} ruleValue
 * @return {number}
 */
var countMatches = function(items, ruleKey, ruleValue) {
    let count = 0;
    let j;
    if(ruleKey === "color"){
            j = 1;
        }else if(ruleKey === "type"){
            j = 0;
        }else{
            j = 2;
        }
    for(let i=0; i<items.length; i++){
        if(items[i][j] === ruleValue){
            count += 1;
        }
    }
    return count;
};