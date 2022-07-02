/**
 * @param {string[]} operations
 * @return {number}
 */
var finalValueAfterOperations = function(operations) {
    let tot = 0;
    for(let i=0; i<operations.length; i++){
        if(operations[i] === "X++" || operations[i] === "++X"){
            tot += 1;
        }else{
            tot -= 1;
        }
    }
    return tot;
};