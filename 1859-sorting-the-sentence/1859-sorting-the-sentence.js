/**
 * @param {string} s
 * @return {string}
 */
var sortSentence = function(s) {
    
    let arrWord = s.split(" ");
    console.log(arrWord);
    
    let sortedArr = [];
    
    for(let i=0; i<arrWord.length; i++){
        // console.log(arrWord[i][arrWord[i].length-1]);
        for(let j=0; j<arrWord.length; j++){
            if(arrWord[j][arrWord[j].length-1] == i+1){
                arrWord[j][arrWord[j].length-1] = '';
                sortedArr.push(arrWord[j]);
            }
        }
    }
    
    let result = [];
    for(let i=0; i<sortedArr.length; i++){
        let bag = '';
        for(let j=0; j<sortedArr[i].length-1; j++){
            bag = bag + sortedArr[i][j]; 
        }
        result.push(bag);
    }
    
    console.log(result.join(" "));
    return result.join(" ");
};