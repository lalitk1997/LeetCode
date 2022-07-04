/**
 * @param {string[]} words
 * @return {string}
 */
var firstPalindrome = function(words) {
    console.log(words);
    for(let i=0; i<words.length; i++){
        let bag = '';
        // for(let j=0; j<words[i].length; j++)
        for(let j=words[i].length-1; j>=0; j--){
            bag = bag + words[i][j]
        }
        console.log(words[i]+" "+bag);
        if(bag === words[i]){
            return words[i];
        }
    }
    return "";
};