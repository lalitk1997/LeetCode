/**
 * @param {string} command
 * @return {string}
 */
var interpret = function(command) {
    let bag = '';
    for(let i=0; i<command.length; i++){
        if(command[i] === 'G'){
            bag = bag + 'G'
        }else if(command[i] === '(' && command[i+1] === ')'){
            bag = bag + 'o'
            i += 1;
        }else if(command[i] === '(' && command[i+1] !== ')'){
            i += 1;
            // console.log(i);
            // console.log("H");
            while(command[i] !== ')'){
                bag = bag + command[i];
                i += 1;
            }
            // i += 1; 
        }
    }
    return bag;
};