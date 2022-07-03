/**
 * @param {string[]} words
 * @return {number}
 */
var uniqueMorseRepresentations = function(words) {
    let morseCode = {"a":".-",
                     "b":"-...",
                     "c":"-.-.",
                     "d":"-..",
                     "e":".",
                     "f":"..-.",
                     "g":"--.",
                     "h":"....",
                     "i":"..",
                     "j":".---",
                     "k":"-.-",
                     "l":".-..",
                     "m":"--",
                     "n":"-.",
                     "o":"---",
                     "p":".--.",
                     "q":"--.-",
                     "r":".-.",
                     "s":"...",
                     "t":"-",
                     "u":"..-",
                     "v":"...-",
                     "w":".--",
                     "x":"-..-",
                     "y":"-.--",
                     "z":"--.."};
    // for(key in morseCode){
    //     console.log(key+" "+morseCode[key]);
    // }
    let arr=[];
    for(let i=0; i<words.length; i++){
        let bag = '';
        for(let j=0; j<words[i].length; j++){
            for(key in morseCode){
                if(key === words[i][j]){
                    bag = bag + morseCode[key];
                    // arr[i][j] = morseCode[key];
                    // console.log(morseCode[key]+" "+words[i][j]+" "+words[i][j]);
                    break;
                }
            }
        }
        arr.push(bag);
    }
    // console.log(arr);
    let idx = 0;
    let unique = {};
    for(let i=0; i<arr.length; i++){
        if(unique[arr[i]] === undefined){
            unique[arr[i]] = 1;
        }else{
            unique[arr[i]] += 1;
        }
    }
    // console.log(unique);
    // console.log(unique.length);
    let lenUnique = 0;
    for(key in unique){
        lenUnique++;
    }
    return lenUnique;
};