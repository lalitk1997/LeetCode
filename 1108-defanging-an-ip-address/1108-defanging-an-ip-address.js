/**
 * @param {string} address
 * @return {string}
 */
var defangIPaddr = function(address) {
    console.log(address);
    let bag = '';
    for(let i=0; i<address.length; i++){
        if(address[i] !== '.'){
            bag = bag + address[i];
        }else{
            // console.log("Hello");
            bag = bag + '[' + address[i] + ']';
        }
        // console.log(address[i]);
        // console.log(bag)
    }
    console.log(bag);
    return bag;
};