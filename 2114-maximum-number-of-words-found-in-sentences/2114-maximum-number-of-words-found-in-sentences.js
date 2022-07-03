/**
 * @param {string[]} sentences
 * @return {number}
 */
var mostWordsFound = function(sentences) {
    let maxLen = -1;
    for(let i=0; i<sentences.length; i++){
        let len = 0;
        for(let j=0; j<sentences[i].length; j++){
            if(sentences[i][j] === " "){
                len += 1;
            }
        }
        // console.log(len);
        if(len > maxLen){
            maxLen = len;
        }
    }
    return maxLen+1;
};