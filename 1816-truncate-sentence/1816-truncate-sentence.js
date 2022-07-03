/**
 * @param {string} s
 * @param {number} k
 * @return {string}
 */
var truncateSentence = function(s, k) {
    let strArr = s.split(" ");
    console.log(strArr);
    console.log(s);
    console.log(k);
    let bag = '';
    for(let i=0; i<k; i++){
        console.log(strArr[i]);
        bag = bag + strArr[i] + ' ';
    }
    console.log(bag);
    return bag.trim();
};