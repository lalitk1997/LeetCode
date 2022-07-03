/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {
    // let arrAllowedStr = allowed.split("");
    let count = 0;
    for(let i=0; i<words.length; i++){
        // let flag1 = false;
        for(let j=0; j<words[i].length; j++){
            let flag = false;
            for(let k=0; k<allowed.length; k++){
                if(words[i][j] === allowed[k]){
                    flag = true;
                    break;
                }
            }
            if(flag === false){
                count += 1;
                break;
            }
        }
    }
    return words.length-count;
};