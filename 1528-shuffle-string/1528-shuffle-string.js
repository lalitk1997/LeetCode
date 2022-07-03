/**
 * @param {string} s
 * @param {number[]} indices
 * @return {string}
 */
var restoreString = function(s, indices) {
    // console.log(s);
    // console.log(indices);
    let reshuffleArr = [];
    for(i=0; i<indices.length; i++){
        reshuffleArr[indices[i]] = s[i];
        // console.log(s[i]);
        // console.log(reshuffleArr)
    }
    // console.log(reshuffleArr);
    return reshuffleArr.join("");
    
};