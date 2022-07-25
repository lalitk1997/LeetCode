/**
 * @param {string} s
 * @return {number}
 */
var balancedStringSplit = function(s) {
    let countR = 0;
    let countStr = 0;
    for(let i=0; i<s.length; i++){
        if(s[i] === 'R'){
            countR += 1;
        }else if(s[i] == 'L'){
            countR -= 1;
        }
        if(countR == 0){
            countStr++
        }
    }
    console.log(countStr);
    return countStr;
};