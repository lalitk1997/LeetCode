/**
 * @param {string[]} word1
 * @param {string[]} word2
 * @return {boolean}
 */
var arrayStringsAreEqual = function(word1, word2) {
    let bag1 = '';
    let bag2 = '';
    for(let i=0; i<word1.length; i++){
        bag1 = bag1 + word1[i]
    }
    for(let i=0; i<word2.length; i++){
        bag2 = bag2 + word2[i]; 
    }
    if(bag1 === bag2){
        return true;
    }
    return false;
};